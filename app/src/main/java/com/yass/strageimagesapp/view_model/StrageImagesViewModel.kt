package com.yass.strageimagesapp.view_model

import android.app.Application
import android.net.Uri
import android.provider.MediaStore
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StrageImagesViewModel(application: Application) : AndroidViewModel(application) {

    private val images = MutableLiveData<MutableList<Uri>>()

    fun getImages(): LiveData<MutableList<Uri>> = this.images

    fun loadImagesFromStrage() {

        val resolver = getApplication<Application>().contentResolver

        viewModelScope.launch(Dispatchers.IO) {

            resolver.query(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                arrayOf(MediaStore.Images.Media._ID),
                null,
                null,
                "${MediaStore.Images.Media.DATE_ADDED} DESC"
            ).use { cursor ->

                cursor ?: return@use

                val images = mutableListOf<Uri>()

                val columnIndexId = cursor.getColumnIndexOrThrow(MediaStore.Images.Media._ID)

                while (cursor.moveToNext()) {

                    val imageId = cursor.getLong(columnIndexId)

                    val uri = Uri.withAppendedPath(
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                        imageId.toString()
                    )

                    images.add(uri)

                    this@StrageImagesViewModel.images.postValue(images)
                }
            }
        }
    }
}
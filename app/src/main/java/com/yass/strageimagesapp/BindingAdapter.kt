package com.yass.strageimagesapp

import android.net.Uri
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yass.strageimagesapp.ui.StrageImagesAdapter

object BindingAdapter {

    @BindingAdapter("bindImages")
    @JvmStatic
    fun RecyclerView.bindPhotos(newImages: MutableList<Uri>?) {

        newImages ?: return

        val adapter = (adapter as StrageImagesAdapter)

        val diff = DiffUtil.calculateDiff(
            DiffUtilImageCallback(adapter.getImages(), newImages), true
        )

        adapter.setImages(newImages)

        diff.dispatchUpdatesTo(adapter)
    }

    @BindingAdapter("loadImage")
    @JvmStatic
    fun loadImage(imageView: ImageView, uri: Uri?) {
        Picasso.get().load(uri).fit().centerCrop().into(imageView)
    }
}
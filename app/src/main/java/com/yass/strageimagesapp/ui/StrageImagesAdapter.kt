package com.yass.strageimagesapp.ui

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yass.strageimagesapp.databinding.ItemImageBinding
import com.yass.strageimagesapp.extension.adjustThumbnailSize

class StrageImagesAdapter(
    private var images: MutableList<Uri> = mutableListOf()
) : RecyclerView.Adapter<StrageImagesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindTo(images[position])
    }

    override fun getItemCount(): Int = images.size

    fun getImages(): MutableList<Uri> = this.images

    fun setImages(images: MutableList<Uri>) = apply { this.images = images }

    class ViewHolder(
        private val binding: ItemImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindTo(uri: Uri) {

            binding.apply {
                this.uri = uri
                photoImage.adjustThumbnailSize()
            }
        }
    }
}
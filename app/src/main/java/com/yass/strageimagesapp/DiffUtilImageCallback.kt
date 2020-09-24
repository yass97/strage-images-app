package com.yass.strageimagesapp

import android.net.Uri
import androidx.recyclerview.widget.DiffUtil

class DiffUtilImageCallback(
    private val oldItems: MutableList<Uri>,
    private val newItems: MutableList<Uri>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldItems.count()

    override fun getNewListSize(): Int = newItems.count()

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return (oldItems[oldItemPosition] == newItems[newItemPosition])
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return (oldItems[oldItemPosition].lastPathSegment == newItems[newItemPosition].lastPathSegment)
    }
}
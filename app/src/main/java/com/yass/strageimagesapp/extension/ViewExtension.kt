package com.yass.strageimagesapp.extension

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager
import android.widget.ImageView
import com.yass.strageimagesapp.R

fun ImageView.adjustThumbnailSize() {

    val thumbnailSize = calcThumbnailSize(context)

    layoutParams.apply {
        width = thumbnailSize
        height = thumbnailSize
    }
}

private fun calcThumbnailSize(context: Context): Int {

    val resources = context.resources

    val widthInPixels = getDisplayWidthInPixels(context)

    val thumbnailSizeMargin = resources.getDimension(R.dimen.recycler_side_margin).toInt()

    val allMarginSize = (thumbnailSizeMargin * 4)

    return ((widthInPixels - allMarginSize) / 3)
}

private fun getDisplayWidthInPixels(context: Context): Int {

    val displayMetrics = DisplayMetrics()

    val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager

    windowManager.defaultDisplay.getRealMetrics(displayMetrics)

    return displayMetrics.widthPixels
}
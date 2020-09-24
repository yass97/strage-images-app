package com.yass.strageimagesapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/yass/strageimagesapp/ui/StrageImagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yass/strageimagesapp/ui/StrageImagesAdapter$ViewHolder;", "images", "", "Landroid/net/Uri;", "(Ljava/util/List;)V", "getImages", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setImages", "ViewHolder", "app_debug"})
public final class StrageImagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.yass.strageimagesapp.ui.StrageImagesAdapter.ViewHolder> {
    private java.util.List<android.net.Uri> images;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yass.strageimagesapp.ui.StrageImagesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.yass.strageimagesapp.ui.StrageImagesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.net.Uri> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yass.strageimagesapp.ui.StrageImagesAdapter setImages(@org.jetbrains.annotations.NotNull()
    java.util.List<android.net.Uri> images) {
        return null;
    }
    
    public StrageImagesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<android.net.Uri> images) {
        super();
    }
    
    public StrageImagesAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/yass/strageimagesapp/ui/StrageImagesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/yass/strageimagesapp/databinding/ItemImageBinding;", "(Lcom/yass/strageimagesapp/databinding/ItemImageBinding;)V", "bindTo", "", "uri", "Landroid/net/Uri;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.yass.strageimagesapp.databinding.ItemImageBinding binding = null;
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.yass.strageimagesapp.databinding.ItemImageBinding binding) {
            super(null);
        }
    }
}
// Generated by data binding compiler. Do not edit!
package com.yass.strageimagesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.yass.strageimagesapp.R;
import com.yass.strageimagesapp.view_model.StrageImagesViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentStrageImagesBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected StrageImagesViewModel mViewModel;

  protected FragmentStrageImagesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setViewModel(@Nullable StrageImagesViewModel viewModel);

  @Nullable
  public StrageImagesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentStrageImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_strage_images, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStrageImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentStrageImagesBinding>inflateInternal(inflater, R.layout.fragment_strage_images, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStrageImagesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_strage_images, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStrageImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentStrageImagesBinding>inflateInternal(inflater, R.layout.fragment_strage_images, null, false, component);
  }

  public static FragmentStrageImagesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentStrageImagesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentStrageImagesBinding)bind(component, view, R.layout.fragment_strage_images);
  }
}
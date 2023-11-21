// Generated by data binding compiler. Do not edit!
package com.study.mysololife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.study.mysololife.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTalkBinding extends ViewDataBinding {
  @NonNull
  public final ListView boardListView;

  @NonNull
  public final ImageView bookmarkTap;

  @NonNull
  public final ImageView homeTap;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final ImageView storeTap;

  @NonNull
  public final ImageView talkTap;

  @NonNull
  public final ImageView tipTap;

  @NonNull
  public final ImageView writeBtn;

  protected FragmentTalkBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ListView boardListView, ImageView bookmarkTap, ImageView homeTap, LinearLayout linearLayout3,
      ImageView storeTap, ImageView talkTap, ImageView tipTap, ImageView writeBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.boardListView = boardListView;
    this.bookmarkTap = bookmarkTap;
    this.homeTap = homeTap;
    this.linearLayout3 = linearLayout3;
    this.storeTap = storeTap;
    this.talkTap = talkTap;
    this.tipTap = tipTap;
    this.writeBtn = writeBtn;
  }

  @NonNull
  public static FragmentTalkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_talk, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTalkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTalkBinding>inflateInternal(inflater, R.layout.fragment_talk, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTalkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_talk, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTalkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTalkBinding>inflateInternal(inflater, R.layout.fragment_talk, null, false, component);
  }

  public static FragmentTalkBinding bind(@NonNull View view) {
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
  public static FragmentTalkBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTalkBinding)bind(component, view, R.layout.fragment_talk);
  }
}

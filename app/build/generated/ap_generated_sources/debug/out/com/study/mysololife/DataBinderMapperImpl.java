package com.study.mysololife;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.study.mysololife.databinding.ActivityBoardEditBindingImpl;
import com.study.mysololife.databinding.ActivityBoardInsideBindingImpl;
import com.study.mysololife.databinding.ActivityBoardWriteBindingImpl;
import com.study.mysololife.databinding.ActivityIntroBindingImpl;
import com.study.mysololife.databinding.ActivityJoinBindingImpl;
import com.study.mysololife.databinding.ActivityLoginBindingImpl;
import com.study.mysololife.databinding.FragmentBookmarkBindingImpl;
import com.study.mysololife.databinding.FragmentHomeBindingImpl;
import com.study.mysololife.databinding.FragmentTalkBindingImpl;
import com.study.mysololife.databinding.FragmentTipBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBOARDEDIT = 1;

  private static final int LAYOUT_ACTIVITYBOARDINSIDE = 2;

  private static final int LAYOUT_ACTIVITYBOARDWRITE = 3;

  private static final int LAYOUT_ACTIVITYINTRO = 4;

  private static final int LAYOUT_ACTIVITYJOIN = 5;

  private static final int LAYOUT_ACTIVITYLOGIN = 6;

  private static final int LAYOUT_FRAGMENTBOOKMARK = 7;

  private static final int LAYOUT_FRAGMENTHOME = 8;

  private static final int LAYOUT_FRAGMENTTALK = 9;

  private static final int LAYOUT_FRAGMENTTIP = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.activity_board_edit, LAYOUT_ACTIVITYBOARDEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.activity_board_inside, LAYOUT_ACTIVITYBOARDINSIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.activity_board_write, LAYOUT_ACTIVITYBOARDWRITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.activity_intro, LAYOUT_ACTIVITYINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.activity_join, LAYOUT_ACTIVITYJOIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.fragment_bookmark, LAYOUT_FRAGMENTBOOKMARK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.fragment_talk, LAYOUT_FRAGMENTTALK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.study.mysololife.R.layout.fragment_tip, LAYOUT_FRAGMENTTIP);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBOARDEDIT: {
          if ("layout/activity_board_edit_0".equals(tag)) {
            return new ActivityBoardEditBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_board_edit is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBOARDINSIDE: {
          if ("layout/activity_board_inside_0".equals(tag)) {
            return new ActivityBoardInsideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_board_inside is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBOARDWRITE: {
          if ("layout/activity_board_write_0".equals(tag)) {
            return new ActivityBoardWriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_board_write is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINTRO: {
          if ("layout/activity_intro_0".equals(tag)) {
            return new ActivityIntroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_intro is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYJOIN: {
          if ("layout/activity_join_0".equals(tag)) {
            return new ActivityJoinBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_join is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKMARK: {
          if ("layout/fragment_bookmark_0".equals(tag)) {
            return new FragmentBookmarkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_bookmark is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALK: {
          if ("layout/fragment_talk_0".equals(tag)) {
            return new FragmentTalkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_talk is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTIP: {
          if ("layout/fragment_tip_0".equals(tag)) {
            return new FragmentTipBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tip is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_board_edit_0", com.study.mysololife.R.layout.activity_board_edit);
      sKeys.put("layout/activity_board_inside_0", com.study.mysololife.R.layout.activity_board_inside);
      sKeys.put("layout/activity_board_write_0", com.study.mysololife.R.layout.activity_board_write);
      sKeys.put("layout/activity_intro_0", com.study.mysololife.R.layout.activity_intro);
      sKeys.put("layout/activity_join_0", com.study.mysololife.R.layout.activity_join);
      sKeys.put("layout/activity_login_0", com.study.mysololife.R.layout.activity_login);
      sKeys.put("layout/fragment_bookmark_0", com.study.mysololife.R.layout.fragment_bookmark);
      sKeys.put("layout/fragment_home_0", com.study.mysololife.R.layout.fragment_home);
      sKeys.put("layout/fragment_talk_0", com.study.mysololife.R.layout.fragment_talk);
      sKeys.put("layout/fragment_tip_0", com.study.mysololife.R.layout.fragment_tip);
    }
  }
}

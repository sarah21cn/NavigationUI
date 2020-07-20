package com.ys.navigationui.coordinatorlayout;

import java.util.ArrayList;
import java.util.List;

import android.view.View;

/**
 * Created by yinshan on 2020/7/15.
 */
public class TestManager {

  private List<View> rootViews;

  private TestManager(){
    rootViews = new ArrayList<>();
  }


  private static class Holder{
    private static TestManager sInstance = new TestManager();
  }

  public static TestManager getInstance(){
    return Holder.sInstance;
  }

  public void addRootView(View rootView){
    rootViews.add(rootView);
  }
}

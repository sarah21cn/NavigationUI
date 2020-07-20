package com.ys.navigationui;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by yinshan on 2020/7/15.
 */
public class NavigationUIApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    LeakCanary.install(this);
  }
}

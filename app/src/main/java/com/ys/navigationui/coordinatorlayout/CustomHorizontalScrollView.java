package com.ys.navigationui.coordinatorlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/**
 * Created by yinshan on 2020/7/13.
 */
public class CustomHorizontalScrollView extends HorizontalScrollView {

  private ScrollViewListener mScrollViewListener;

  public CustomHorizontalScrollView(Context context) {
    super(context);
  }

  public CustomHorizontalScrollView(Context context,
      AttributeSet attrs) {
    super(context, attrs);
  }

  public CustomHorizontalScrollView(Context context, AttributeSet attrs,
      int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onScrollChanged(int l, int t, int oldl, int oldt) {
    super.onScrollChanged(l, t, oldl, oldt);
    if(mScrollViewListener != null){
      mScrollViewListener.onScrollChanged(l, t, oldl, oldt);
    }
  }

  public void setScrollViewListener(ScrollViewListener listener){
    this.mScrollViewListener = listener;
  }
}

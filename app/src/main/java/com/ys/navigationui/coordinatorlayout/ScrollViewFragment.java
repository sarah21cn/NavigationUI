package com.ys.navigationui.coordinatorlayout;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ys.navigationui.R;

/**
 * Created by yinshan on 2020/7/10.
 */
public class ScrollViewFragment extends Fragment {

  private CustomHorizontalScrollView scrollView;
  private LinearLayout viewContainer;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view =
        LayoutInflater.from(getContext()).inflate(R.layout.fragment_scroll_view, container, false);
    scrollView = view.findViewById(R.id.scroll_view);
    viewContainer = view.findViewById(R.id.view_container);

    scrollView.setScrollViewListener(new ScrollViewListener() {

      @Override
      public void onScrollChanged(int x, int y, int oldx, int oldy) {
        Log.d("test", x + " " + y + " " + oldx + " " + oldy);

        // 监听view是否可用
        Rect scrollBounds = new Rect();
        viewContainer.getHitRect(scrollBounds);
        for (int i = 0; i < viewContainer.getChildCount(); i++) {
          View childView = viewContainer.getChildAt(i);
          if (childView.getLocalVisibleRect(scrollBounds)) {
            // Any portion of the imageView, even a single pixel, is within the visible window
            logPosition(i, i);
          } else {
            // NONE of the imageView is within the visible window

          }
        }
      }

    });

    for (int i = 0; i < 10; i++) {
      TextView textView = new TextView(getContext());
      textView.setText(String.valueOf(i));
      LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(300, 150);
      viewContainer.addView(textView, lp);
    }
    return view;
  }

  private void logPosition(int startPosition, int endPosition){
    for(int position = startPosition; position <= endPosition; position++){
      Log.d("test", "log:" + position);
    }
  }

}

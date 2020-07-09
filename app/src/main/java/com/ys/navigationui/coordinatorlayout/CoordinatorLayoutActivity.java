package com.ys.navigationui.coordinatorlayout;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.ys.navigationui.R;

/**
 * Created by yinshan on 2020/7/8.
 */
public class CoordinatorLayoutActivity extends FragmentActivity {

  private ViewPager viewPager;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_coordinator_layout);

    viewPager = findViewById(R.id.view_pager);
    List<Fragment> fragmentList = new ArrayList<>();
    for(int i = 0; i < 3; i++){
      RecyclerViewFragment fragment = new RecyclerViewFragment();
      fragment.setData(i);
      fragmentList.add(fragment);
    }

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentAdapter adapter = new FragmentAdapter(fragmentManager, 0, fragmentList);
    viewPager.setAdapter(adapter);
  }

}

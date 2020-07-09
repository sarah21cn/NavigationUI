package com.ys.navigationui.coordinatorlayout;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by yinshan on 2020/7/9.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

  private List<Fragment> fragmentList;

  public FragmentAdapter(@NonNull FragmentManager fm, int behavior, List<Fragment> fragmentList) {
    super(fm, behavior);
    this.fragmentList = fragmentList;
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
    return fragmentList.get(position);
  }

  @Override
  public int getCount() {
    return fragmentList.size();
  }

  @Nullable
  @Override
  public CharSequence getPageTitle(int position) {
    return super.getPageTitle(position);
  }
}

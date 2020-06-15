package com.ys.navigationui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * Created by yinshan on 2020/6/15.
 */
public class MainFragment extends Fragment {
  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_main, container, false);
    view.findViewById(R.id.menu_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_menuActivity));
    view.findViewById(R.id.drawer_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_drawerActivity));
    view.findViewById(R.id.botton_navbar_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_bottomNavBarActivity));
    return view;
  }
}

package com.ys.navigationui.bottomnavbar;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ys.navigationui.R;

/**
 * Created by yinshan on 2020/6/15.
 */
public class BottomNavBarActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_navbar);

    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
    NavigationUI.setupWithNavController(bottomNavigationView, navController);
  }
}

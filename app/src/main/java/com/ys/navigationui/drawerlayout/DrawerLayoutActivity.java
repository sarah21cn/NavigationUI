package com.ys.navigationui.drawerlayout;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.ys.navigationui.R;

/**
 * Created by yinshan on 2020/6/15.
 */
public class DrawerLayoutActivity extends AppCompatActivity {

  private NavController navController;
  private AppBarConfiguration appBarConfiguration;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_drawer_layout);

    DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
    navController = Navigation.findNavController(this, R.id.nav_host_fragment);

    appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setDrawerLayout(drawerLayout).build();
    NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

    NavigationView navigationView = findViewById(R.id.navigation_view);
    NavigationUI.setupWithNavController(navigationView, navController);
  }

  @Override
  public boolean onSupportNavigateUp() {
    return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
  }
}

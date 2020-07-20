package com.ys.navigationui.coordinatorlayout;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ys.navigationui.R;

/**
 * Created by yinshan on 2020/7/9.
 */
public class RecyclerViewFragment extends Fragment {

  private static final String TAG = "RecyclerViewFragment";

  private MyConstraintLayout view;
  private TextView textView;
  private RecyclerView recyclerView;

  private int position;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    Log.d(TAG, "onCreateView");
    view = (MyConstraintLayout) inflater.inflate(R.layout.fragment_recycler_view, container, false);
    textView = view.findViewById(R.id.text_view);
    recyclerView = view.findViewById(R.id.recycler_view);
    textView.setText(String.valueOf(position));

    RecyclerViewAdapter adapter = new RecyclerViewAdapter();
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

    if(position == 0){
      List<String> dataList = new ArrayList<>();
      for(int i = 0; i < 20; i++){
        dataList.add(String.valueOf(i));
      }
      adapter.setDataList(dataList);
    }

    //TestManager.getInstance().addRootView(view);

    return view;
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    Log.d(TAG, "onDestroyView");
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    Log.d(TAG, "onDestroy");
  }

  public void setData(int position){
    this.position = position;
  }
}

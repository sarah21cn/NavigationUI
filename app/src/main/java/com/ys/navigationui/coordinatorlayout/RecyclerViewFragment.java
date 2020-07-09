package com.ys.navigationui.coordinatorlayout;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ys.navigationui.R;

/**
 * Created by yinshan on 2020/7/9.
 */
public class RecyclerViewFragment extends Fragment {

  private TextView textView;
  private RecyclerView recyclerView;

  private int position;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
    textView = view.findViewById(R.id.text_view);
    recyclerView = view.findViewById(R.id.recycler_view);
    textView.setText(String.valueOf(position));

    if(position == 0){
      RecyclerViewAdapter adapter = new RecyclerViewAdapter();
      List<String> dataList = new ArrayList<>();
      for(int i = 0; i < 20; i++){
        dataList.add(String.valueOf(i));
      }
      adapter.setDataList(dataList);
      recyclerView.setAdapter(adapter);
      recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    return view;
  }

  public void setData(int position){
    this.position = position;
  }
}

package com.ys.navigationui.coordinatorlayout;

import java.util.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ys.navigationui.R;

/**
 * Created by yinshan on 2020/7/9.
 * recyclerview的adapter
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

  private List<String> dataList;

  public void setDataList(List<String> dataList){
    this.dataList = dataList;
    notifyDataSetChanged();
  }

  @Override
  public int getItemCount() {
    return dataList == null ? 0 : dataList.size();
  }

  @NonNull
  @Override
  public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_view_item, parent, false);
    return new RecyclerViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
    holder.setData(dataList.get(position));
  }

  public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    private TextView textView;

    public RecyclerViewHolder(@NonNull View itemView) {
      super(itemView);
      textView = itemView.findViewById(R.id.text_view);
    }

    public void setData(String data){
      textView.setText(data);
    }
  }
}

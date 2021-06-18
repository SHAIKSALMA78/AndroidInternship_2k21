package com.example.exampledatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exampledatabase.RDB.RTable;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.HoldView> {
    Context ct;
    List<RTable> list;

    public MyAdapter(Context ct, List<RTable> list) {
        this.ct = ct;
        this.list = list;
    }

    @NonNull
    @Override
    public HoldView onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new HoldView(LayoutInflater.from(ct)
        .inflate(R.layout.row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.HoldView holder, int position) {
        holder.et1.setText(list.get(position).getSroll());
        holder.et2.setText(list.get(position).getSname());
        holder.et3.setText(list.get(position).getSnumber());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HoldView extends RecyclerView.ViewHolder {
        EditText et1,et2,et3;
        ImageButton edit,del;
        public HoldView(@NonNull  View itemView) {
            super(itemView);
            et1=itemView.findViewById(R.id.roll);
            et2=itemView.findViewById(R.id.name);
            et3=itemView.findViewById(R.id.num);
            edit=itemView.findViewById(R.id.update);
            del=itemView.findViewById(R.id.delete);
        }
    }
}
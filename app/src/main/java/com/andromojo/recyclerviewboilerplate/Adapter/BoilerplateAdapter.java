package com.andromojo.recyclerviewboilerplate.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andromojo.recyclerviewboilerplate.R;

public class BoilerplateAdapter extends RecyclerView.Adapter<BoilerplateAdapter.holder> {
    String recyclerViewItemArrayData[];

    public BoilerplateAdapter(String[] recyclerViewItemArrayData) {
        this.recyclerViewItemArrayData = recyclerViewItemArrayData;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recyclerview_single_row,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.displayTextInSingleRow.setText(recyclerViewItemArrayData[position]);
    }

    @Override
    public int getItemCount() {
        return recyclerViewItemArrayData.length;
    }

    public class holder extends RecyclerView.ViewHolder {
        TextView displayTextInSingleRow;
        public holder(@NonNull View itemView) {
            super(itemView);
            displayTextInSingleRow = (TextView) itemView.findViewById(R.id.displayTextInSingleRow);
        }
    }
}

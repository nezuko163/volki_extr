package com.example.start_menu.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.start_menu.R;
import com.example.start_menu.databinding.LekarstvoItemBinding;
import com.example.start_menu.model.LekarstvoModelj;

import java.util.ArrayList;

public class LekarstvoHomeAdapterj extends RecyclerView.Adapter<LekarstvoHomeAdapterj.LekarstvoHolderj> {
    private ArrayList<LekarstvoModelj> list = new ArrayList<>();
    public onItemClickListener onItemClickListener;

    public LekarstvoHomeAdapterj(ArrayList<LekarstvoModelj> list, com.example.start_menu.adapter.onItemClickListener onItemClickListener) {
        this.list = list;
        this.onItemClickListener = onItemClickListener;
    }

    public class LekarstvoHolderj extends RecyclerView.ViewHolder {

        private LekarstvoItemBinding binding = LekarstvoItemBinding.bind(itemView);
        public LekarstvoHolderj(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(LekarstvoModelj item) {
            binding.cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onCancelClick(item);
                }
            });
            binding.check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onCheckClick(item);
                }
            });
            binding.lekarstvoName.setText(item.name);
        }
    }

    @NonNull
    @Override
    public LekarstvoHolderj onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lekarstvo_item, parent, false);
        return new LekarstvoHolderj(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LekarstvoHolderj holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<LekarstvoModelj> _list) {
        list = _list;
        notifyDataSetChanged();
    }
}

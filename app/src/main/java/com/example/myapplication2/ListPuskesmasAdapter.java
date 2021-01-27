package com.example.myapplication2;


import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPuskesmasAdapter extends RecyclerView.Adapter<ListPuskesmasAdapter.ListViewHolder> {
    private ArrayList<Puskesmas> listPuskesmas;
    private OnItemClickCallback onItemClickCallback;


    public ListPuskesmasAdapter(ArrayList<Puskesmas> list) {
        this.listPuskesmas = list;
    }
     void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_puskesmas, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Puskesmas puskesmas = listPuskesmas.get(position);
        Glide.with(holder.itemView.getContext())
                .load(puskesmas.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(puskesmas.getName());
        holder.tvDetail.setText(puskesmas.getDetail());
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onItemClickCallback.onItemClicked(listPuskesmas.get(holder.getAdapterPosition()));

                        Intent intent = new Intent(holder.itemView.getContext(), detail.class);
                        intent.putExtra(detail.EXTRA_NAMA, puskesmas.getName());
                        intent.putExtra(detail.EXTRA_DETAIL, puskesmas.getDetail());
                        intent.putExtra(detail.EXTRA_PHOTO,puskesmas.getPhoto());

                        holder.itemView.getContext().startActivity(intent);



                    }
                });
    }

    @Override
    public int getItemCount() {
        return listPuskesmas.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Puskesmas data) ;

        }
    }

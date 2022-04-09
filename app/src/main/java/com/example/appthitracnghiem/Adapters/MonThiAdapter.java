package com.example.appthitracnghiem.Adapters;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appthitracnghiem.Model.MonThi;
import com.example.appthitracnghiem.R;

import java.util.List;

public class MonThiAdapter extends RecyclerView.Adapter<MonThiAdapter.MonThiViewHolder>{

    private List<MonThi> listMonThi;

    public MonThiAdapter(List<MonThi> listMonThi) {
        this.listMonThi = listMonThi;
    }


    @NonNull
    @Override
    public MonThiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_monthi,parent,false);
        return new MonThiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonThiViewHolder holder, int position) {
        MonThi monThi = listMonThi.get(position);
        if(monThi==null){
            return;
        }
        if(monThi.getHinhAnh()!=null){
            Bitmap bitmapHinhAnhMonThi= BitmapFactory.decodeByteArray(monThi.getHinhAnh(),0,monThi.getHinhAnh().length);
            holder.imgMonThi.setImageBitmap(bitmapHinhAnhMonThi);
        }
        holder.tvMonThi.setText(monThi.getTenMon());
    }

    @Override
    public int getItemCount() {
        if(listMonThi!=null){
            return listMonThi.size();
        }
        return 0;
    }

    public class MonThiViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgMonThi;
        private TextView tvMonThi;

        public MonThiViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMonThi = itemView.findViewById(R.id.imgMonThi);
            tvMonThi = itemView.findViewById(R.id.titleMonThi);

        }
    }
}

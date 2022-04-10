package com.example.appthitracnghiem.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appthitracnghiem.Activitys.MainActivity;
import com.example.appthitracnghiem.Commons.Common;
import com.example.appthitracnghiem.Model.DeThi;
import com.example.appthitracnghiem.R;

import java.util.List;

public class DeThiAdapter extends RecyclerView.Adapter<DeThiAdapter.DeThiHolder> {

    private List<DeThi> deThiList;
    private Context context;

    public DeThiAdapter(Context context,List<DeThi> deThiList) {
        this.deThiList = deThiList;
        this.context = context;
    }

    @NonNull
    @Override
    public DeThiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dethi,parent,false);
        return new DeThiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeThiHolder holder, int position) {
        DeThi deThi = deThiList.get(position);
        if(deThi==null)
            return;
        holder.tv_tendethi.setText(deThi.getTenDeThi());
        holder.tv_thoigianthi.setText(deThi.getThoiGianThi()+"");
        holder.cv_dethi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Chuyển sang activity main
                Intent intent = new Intent(context, MainActivity.class);
                Common.IDDETHI = deThi.getIDDeThi();
                Common.THOI_GIAN_THI=deThi.getThoiGianThi()*60; //giây
                Common.SOLUONGCAUHOI=deThi.getSoLuongCauHoi();
                Common.TEN_DE_THI=deThi.getTenDeThi();
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(deThiList!=null)
            return deThiList.size();
        return 0;
    }

    public class DeThiHolder extends RecyclerView.ViewHolder{
        private TextView tv_thoigianthi;
        private TextView tv_tendethi;
        private CardView cv_dethi;
        public DeThiHolder(@NonNull View itemView) {
            super(itemView);
            tv_thoigianthi=itemView.findViewById(R.id.tv_thoigianthi);
            tv_tendethi=itemView.findViewById(R.id.tv_TenDeThi);
            cv_dethi=itemView.findViewById(R.id.cv_DeThi);
        }
    }
}

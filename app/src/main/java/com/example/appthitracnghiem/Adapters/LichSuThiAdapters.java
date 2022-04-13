package com.example.appthitracnghiem.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.appthitracnghiem.Model.KetQua;
import com.example.appthitracnghiem.Model.LichSuThi;
import com.example.appthitracnghiem.R;

import java.util.List;

public class LichSuThiAdapters extends ArrayAdapter<LichSuThi> {

    public LichSuThiAdapters(@NonNull Context context, int resource, @NonNull List<LichSuThi> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        convertView = View.inflate(parent.getContext(), R.layout.item_lich_su_thi_t, null);

        LichSuThi lichSuThi = getItem(position);
        TextView txtTenDeThi = convertView.findViewById(R.id.txtTenDeThi);
        TextView txtDiem = convertView.findViewById(R.id.txtDiemThi);

        txtTenDeThi.setText(lichSuThi.getTenDeThi());
        txtDiem.setText(lichSuThi.getDiem() + "");

        return convertView;
    }


}

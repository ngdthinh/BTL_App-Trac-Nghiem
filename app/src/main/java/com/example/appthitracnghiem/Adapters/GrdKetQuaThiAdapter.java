package com.example.appthitracnghiem.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.appthitracnghiem.Commons.Common;
import com.example.appthitracnghiem.Model.ChiTietBaiLam;
import com.example.appthitracnghiem.R;

import java.util.ArrayList;
import java.util.List;

public class GrdKetQuaThiAdapter extends ArrayAdapter<ChiTietBaiLam> {

    static List<ChiTietBaiLam> lstChiTietBaiLam;

    public GrdKetQuaThiAdapter(@NonNull Context context, int resource, @NonNull List<ChiTietBaiLam> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        convertView = View.inflate(parent.getContext(), R.layout.item_grid_ketquathi_t, null);


        ChiTietBaiLam chiTietBaiLam = getItem(position);

        TextView txtCauHoiGrd = convertView.findViewById(R.id.txtCauHoiGrd);
        ImageView imvKiemTraDapAn = convertView.findViewById(R.id.imvKiemTraDapAn);


        txtCauHoiGrd.setText(chiTietBaiLam.getSoCauHoi());
        imvKiemTraDapAn.setImageResource(chiTietBaiLam.getLinkAnh());


//        return v;
        return convertView;

    }

    public static List<ChiTietBaiLam> getLstChiTietBaiLam() {
        lstChiTietBaiLam = new ArrayList<>();
        String dapAnNguoiDung = "";
        String dapAnDung = "";
        Common.SO_CAU_DUNG = 0;
        for (int i = 0; i < Common.chiTietDeThiList.size(); i++) {
            dapAnNguoiDung = Common.chiTietDeThiList.get(i).getDapAnLuaChon();
            dapAnDung = Common.cauHoiList.get(i).getDapAn();
            if (dapAnNguoiDung == null) {
                lstChiTietBaiLam.add(new ChiTietBaiLam(
                        "Câu " + (i + 1), R.drawable.ic_miss_t));
            } else if (dapAnNguoiDung.equals(dapAnDung)) {
                Common.SO_CAU_DUNG += 1;
                lstChiTietBaiLam.add(new ChiTietBaiLam(
                        "Câu " + (i + 1), R.drawable.ic_true_t));
            } else
                lstChiTietBaiLam.add(new ChiTietBaiLam(
                        "Câu " + (i + 1), R.drawable.ic_false_t));
        }
        return lstChiTietBaiLam;
    }
}

package com.example.appthitracnghiem.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.appthitracnghiem.Commons.Common;
import com.example.appthitracnghiem.R;

public class KetQuaActivity extends AppCompatActivity {
    private TextView tv_1,tv_2,tv_3,tv_4,tv_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        tv_1=findViewById(R.id.tv_1);
        tv_1.setText(Common.chiTietDeThiList.get(0).getDapAnLuaChon());

        tv_2=findViewById(R.id.tv_2);
        tv_2.setText(Common.chiTietDeThiList.get(1).getDapAnLuaChon());

        tv_3=findViewById(R.id.tv_3);
        tv_3.setText(Common.chiTietDeThiList.get(2).getDapAnLuaChon());

        tv_4=findViewById(R.id.tv_4);
        tv_4.setText(Common.chiTietDeThiList.get(3).getDapAnLuaChon());

        tv_5=findViewById(R.id.tv_5);
        tv_5.setText(Common.chiTietDeThiList.get(4).getDapAnLuaChon());
    }
}
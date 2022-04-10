package com.example.appthitracnghiem.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import com.example.appthitracnghiem.Adapters.DeThiAdapter;

import com.example.appthitracnghiem.Commons.Common;
import com.example.appthitracnghiem.ConfigDB.Database;
import com.example.appthitracnghiem.Model.DeThi;
import com.example.appthitracnghiem.R;

import java.util.ArrayList;
import java.util.List;

public class DeThiActivity extends AppCompatActivity {

    private DeThiAdapter deThiAdapter;
    private RecyclerView rcvDeThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_thi);

        initView();
    }

    private void initView() {
        rcvDeThi=findViewById(R.id.rsv_dethi);
        deThiAdapter = new DeThiAdapter(this,getListDeThi());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvDeThi.setLayoutManager(linearLayoutManager);
        rcvDeThi.setAdapter(deThiAdapter);
    }

    private List<DeThi> getListDeThi(){
        List<DeThi> list =new ArrayList<>();
        try {
            SQLiteDatabase db= Database.initDatabase(DeThiActivity.this, Common.DATABASE_NAME);
            Cursor cursor = db.rawQuery("SELECT * FROM DeThi WHERE IDMonThi=? AND IDLop=? ",new String[]{Common.IDMONTHI+"",Common.LOP+""});
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                DeThi deThi = new DeThi();
                deThi.setIDDeThi(cursor.getInt(0));
                deThi.setTenDeThi(cursor.getString(1));
                deThi.setThoiGianThi(cursor.getInt(2));
                deThi.setSoLuongCauHoi(cursor.getInt(3));
                list.add(deThi);
                cursor.moveToNext();
            }
        }
        catch(SQLException e) {
            Toast.makeText(DeThiActivity.this,"Lỗi kết nối tới CSDL",Toast.LENGTH_SHORT).show();
        }
        return list;
    }
}
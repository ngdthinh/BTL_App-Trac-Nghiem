package com.example.appthitracnghiem.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.appthitracnghiem.Adapters.LichSuThiAdapters;
import com.example.appthitracnghiem.Commons.Common;
import com.example.appthitracnghiem.ConfigDB.Database;
import com.example.appthitracnghiem.Model.LichSuThi;
import com.example.appthitracnghiem.R;

import java.util.ArrayList;
import java.util.List;

public class LichSuThiActivity extends AppCompatActivity {

    ListView lstView;
    LichSuThiAdapters lichSuThiAdapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_su_thi);

        addConTrolsLst();
    }

    private void addConTrolsLst() {
        lstView = findViewById(R.id.lstLichSuThi);
        lichSuThiAdapters = new LichSuThiAdapters(
                this, R.layout.item_lich_su_thi_t, getChiTietDeThiList());

        lstView.setAdapter(lichSuThiAdapters);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public List<LichSuThi> getChiTietDeThiList() {
        List<LichSuThi> listLicSuThi = new ArrayList<>();
        try {
            SQLiteDatabase db = Database.initDatabase(this, Common.DATABASE_NAME);
            Cursor cursor = db.rawQuery("SELECT distinct d.TenDeThi, k.Diem" +
                    " FROM KetQua AS k, DeThi AS d, HocSinh AS h" +
                    " WHERE k.IDHocSinh=h.IDHocSinh and k.IDDeThi=d.IDDeThi ", null);
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                LichSuThi lichSuThi = new LichSuThi(cursor.getString(0), cursor.getDouble(1));
                listLicSuThi.add(lichSuThi);
                cursor.moveToNext();
            }
            System.out.println(cursor.getCount());

        } catch (SQLException e) {
            Toast.makeText(this, "Lỗi kết nối tới CSDL", Toast.LENGTH_SHORT).show();
        }
        return listLicSuThi;
    }

    public void openMonThiActivity(View view) {
        Intent i = new Intent(this, MonThiActivity.class);
        startActivity(i);
    }
}
package com.example.appthitracnghiem.Commons;

import com.example.appthitracnghiem.Model.CauHoi;
import com.example.appthitracnghiem.Model.ChiTietDeThi;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static final int IDDETHI=1;
    public static final int IDMONTHI=1;
    public static final int SoLUONGCAUHOI=5;
    public static final int LOP=12;
    public static final String DATABASE_NAME= "AppThiTracNghiem.db";

    public static final int THOI_GIAN_THI=65; //giây
    public static  int THOI_GIAN_LAM_BAI=0;

    public static  String TEN_HOC_SINH;
    public static String  TEN_DE_THI;

    public static List<ChiTietDeThi> chiTietDeThiList=new ArrayList<>();
    public static List<CauHoi> cauHoiList=new ArrayList<>();
}

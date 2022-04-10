package com.example.appthitracnghiem.Model;

public class DeThi {
    private int IDDeThi,ThoiGianThi,IDMonThi,IDLop,SoLuongCauHoi;
    private String TenDeThi;

    public DeThi() {
    }

    public DeThi(int IDDeThi, int thoiGianThi, int IDMonThi, int IDLop, int soLuongCauHoi, String tenDeThi) {
        this.IDDeThi = IDDeThi;
        ThoiGianThi = thoiGianThi;
        this.IDMonThi = IDMonThi;
        this.IDLop = IDLop;
        SoLuongCauHoi = soLuongCauHoi;
        TenDeThi = tenDeThi;
    }

    public int getIDDeThi() {
        return IDDeThi;
    }

    public void setIDDeThi(int IDDeThi) {
        this.IDDeThi = IDDeThi;
    }

    public int getThoiGianThi() {
        return ThoiGianThi;
    }

    public void setThoiGianThi(int thoiGianThi) {
        ThoiGianThi = thoiGianThi;
    }

    public int getIDMonThi() {
        return IDMonThi;
    }

    public void setIDMonThi(int IDMonThi) {
        this.IDMonThi = IDMonThi;
    }

    public int getIDLop() {
        return IDLop;
    }

    public void setIDLop(int IDLop) {
        this.IDLop = IDLop;
    }

    public int getSoLuongCauHoi() {
        return SoLuongCauHoi;
    }

    public void setSoLuongCauHoi(int soLuongCauHoi) {
        SoLuongCauHoi = soLuongCauHoi;
    }

    public String getTenDeThi() {
        return TenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        TenDeThi = tenDeThi;
    }
}

package com.example.appthitracnghiem.Model;

public class LichSuThi {
    private String tenDeThi;
    private double diem;

    public LichSuThi() {
    }

    public LichSuThi(String tenDeThi, double diem) {
        this.tenDeThi = tenDeThi;
        this.diem = diem;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}

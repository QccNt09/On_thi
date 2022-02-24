/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class NhanVien extends Person{
    private int maNV;
    private double HSL;
    private String donVi;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh,int maNV, double HSL, String donVi) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNV = maNV;
        this.HSL = HSL;
        this.donVi = donVi;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    @Override
    public String toString() {
        return super.toString() + ", maNV= " + maNV + ", HSL=" + HSL + ", donVi=" + donVi;
    }
    
    
}

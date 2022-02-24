/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

/**
 *
 * @author ADMIN
 */
public class DienThoai extends HangHoa{
    private String nhaSanXuat;
    private int dungLuongBoNho;
    private String mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaSanXuat, int dungLuongBoNho, String mauSac) {
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.mauSac = mauSac;
    }

    public DienThoai(String nhaSanXuat, int dungLuongBoNho, String mauSac, int maHang) {
        super(maHang);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.mauSac = mauSac;
    }

    public DienThoai(String nhaSanXuat, int dungLuongBoNho, String mauSac, int maHang, String tenHang) {
        super(maHang, tenHang);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.mauSac = mauSac;
    }

    public DienThoai(String nhaSanXuat, int dungLuongBoNho, String mauSac, int maHang, String tenHang, int giaBan) {
        super(maHang, tenHang, giaBan);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.mauSac = mauSac;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getDungLuongBoNho() {
        return dungLuongBoNho;
    }

    public void setDungLuongBoNho(int dungLuongBoNho) {
        this.dungLuongBoNho = dungLuongBoNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return super.toString() + ", nhaSanXuat = " + nhaSanXuat + ", dungLuongBoNho = " + dungLuongBoNho + ", mauSac = " + mauSac;
    }
    
    
    
}

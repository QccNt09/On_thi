/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_MN;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int msp;
    private String tenSP;
    private double donGia;
    private String ngaySX;
    private int soLuong;
    
     

    public SanPham() {
    }

    public SanPham(int msp, String tenSP, double donGia, String ngaySX, int soLuong) {
        this.msp = msp;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.soLuong = soLuong;
    }
    
    

    public int getMsp() {
        return msp;
    }

    public void setMsp(int msp) {
        this.msp = msp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double thanhTien(){
        return soLuong*donGia;
    }
    
    public void nhapsp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        msp = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap gia cua san pham: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap ngay san xuat: ");
        ngaySX= sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        }

    @Override
    public String toString() {
        return "SanPham{" + "msp=" + msp + ", tenSP=" + tenSP + ", donGia=" + donGia + ", ngaySX=" + ngaySX + ", soLuong=" + soLuong + ", thanh tien= "+thanhTien()+'}';
    }

   
    
    

     
}

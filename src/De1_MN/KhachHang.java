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
public class KhachHang {
    private int mkh;
    private String tenKH;
    private int namSinh;
    private String to,phuong,quan,thanhPho;
    private double tongTien;
    Scanner sc = new Scanner(System.in);

    public KhachHang() {
    }

    public KhachHang(int mkh, String tenKH, int namSinh, String to, String phuong, String quan, String thanhPho) {
        this.mkh = mkh;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.to = to;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
    }

    public int getMkh() {
        return mkh;
    }

    public void setMkh(int mkh) {
        this.mkh = mkh;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    
    public String diaChi(){
        return ", to=" + to + ", phuong=" + phuong + ", quan=" + quan + ", thanhPho=" + thanhPho;
    }
    public void nhapTT(){
        System.out.println("Nhap ma khach hang: ");
        mkh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten khach hang: ");
        tenKH = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap to: ");
        to = sc.nextLine();
        System.out.println("Nhap phuong: ");
        phuong = sc.nextLine();
        System.out.println("Nhap quan: ");
        quan = sc.nextLine();
        System.out.println("Nhap thanh pho: ");
        thanhPho = sc.nextLine();   
    }
    public void doiTen(String Ten){
        setTenKH(Ten);
    }
    public void doiNamSinh(int namSinh){
        setNamSinh(namSinh);
    }

    @Override
    public String toString() {
        return "KhachHang{" + "mkh=" + mkh + ", tenKH=" + tenKH + ", namSinh=" + namSinh + ", to=" + to + ", phuong=" + phuong + ", quan=" + quan + ", thanhPho=" + thanhPho + ", tongTien=" + tongTien + '}';
    }
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ThiSinhKhoiC extends ThiSinh{
    private double diemVan,diemSu,diemDia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(double diemVan, double diemSu, double diemDia) {
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public ThiSinhKhoiC(double diemVan, double diemSu, double diemDia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(double diemSu) {
        this.diemSu = diemSu;
    }

    public double getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(double diemDia) {
        this.diemDia = diemDia;
    }
    public double tongDiem(){
        return diemVan+diemSu+diemDia;
    }

    @Override
    public void nhapTT(){
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem van: ");
        diemVan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem su: ");
        diemSu = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem dia: ");
        diemDia = Integer.parseInt(sc.nextLine());
    }
    public String toString() {
        return super.toString() + ",Diem van: " + diemVan + ", Diem su: " + diemSu + ", Diem dia: " + diemDia ;
    }
    
    
    
}

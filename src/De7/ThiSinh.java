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
public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh : ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }
    @Override
    public String toString() {
        return  "Ho ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", Dia chi: " + diaChi ;
    }
    
    
    
}

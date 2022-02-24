/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeAT15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanNganHang {
    private String STK;
    private double sodu;
    ArrayList<GiaoDich> listgd = new ArrayList<>();

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(String STK, double sodu) {
        this.STK = STK;
        this.sodu = sodu;
    }

    public String getSTK() {
        return STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }
    public void nhapTTKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan: ");
        STK = sc.nextLine();
        System.out.println("Nhap so du: ");
        sodu = Double.parseDouble(sc.nextLine());
         
    }
    public void Thaydoisodu(double soTien){
        sodu+=soTien;
        
    }
    @Override
    public String toString() {
        return "TaiKhoanNganHang{" + "STK=" + STK + ", sodu=" + sodu + '}';
    }
    
    
    
}

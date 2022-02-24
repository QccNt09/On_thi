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
public class HangHoa {
    private int maHang;
    private String tenHang;
    private int giaBan;

    public HangHoa() {
    }

    public HangHoa(int maHang) {
        this.maHang = maHang;
    }

    public HangHoa(int maHang, String tenHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
    }

    public HangHoa(int maHang, String tenHang, int giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaBan = giaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return  "maHang = " + maHang + ", tenHang = " + tenHang + ", giaBan = " + giaBan;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeAT15;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChiNhanhNganHang {
    private String maChiNhanh;
    private String tenChiNhanh;
    private String diaChi;
    ArrayList<KhachHang> listkh = new ArrayList<>();

    public ChiNhanhNganHang() {
    }

    public ChiNhanhNganHang(String maChiNhanh, String tenChiNhanh, String diaChi) {
        this.maChiNhanh = maChiNhanh;
        this.tenChiNhanh = tenChiNhanh;
        this.diaChi = diaChi;
    }

    public String getMaChiNhanh() {
        return maChiNhanh;
    }

    public void setMaChiNhanh(String maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }

    public String getTenChiNhanh() {
        return tenChiNhanh;
    }

    public void setTenChiNhanh(String tenChiNhanh) {
        this.tenChiNhanh = tenChiNhanh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "ChiNhanhNganHang{" + "maChiNhanh=" + maChiNhanh + ", tenChiNhanh=" + tenChiNhanh + ", diaChi=" + diaChi + '}';
    }
    
    
}

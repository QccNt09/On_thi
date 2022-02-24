/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeAT15;

/**
 *
 * @author ADMIN
 */
public class GiaoDich {
    private String maGiaoDich,ngayGiaoDich;
    private double soTienGiaoDich;
    private String loaiGiaoDich;

    public GiaoDich() {
    }
    

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double soTienGiaoDich, String loaiGiaoDich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.soTienGiaoDich = soTienGiaoDich;
        this.loaiGiaoDich = loaiGiaoDich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getSoTienGiaoDich() {
        return soTienGiaoDich;
    }

    public void setSoTienGiaoDich(double soTienGiaoDich) {
        this.soTienGiaoDich = soTienGiaoDich;
    }

    public String getLoaiGiaoDich() {
        return loaiGiaoDich;
    }

    public void setLoaiGiaoDich(String loaiGiaoDich) {
        this.loaiGiaoDich = loaiGiaoDich;
    }

    @Override
    public String toString() {
        return "maGiaoDich{" + "maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", soTienGiaoDich=" + soTienGiaoDich + ", loaiGiaoDich=" + loaiGiaoDich + '}';
    }
    
    
    
}

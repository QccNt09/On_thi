/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2;

/**
 *
 * @author ADMIN
 */
public class SinhVien extends Person{
    private String chuyenNghanh;
    private double diemQuaTrinh;
    private double diemHocPhan;

    public SinhVien() {
    }

    public SinhVien(String chuyenNghanh, double diemQuaTrinh, double diemHocPhan) {
        this.chuyenNghanh = chuyenNghanh;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemHocPhan = diemHocPhan;
    }

    public SinhVien(String chuyenNghanh, double diemQuaTrinh, double diemHocPhan, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.chuyenNghanh = chuyenNghanh;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemHocPhan = diemHocPhan;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public double getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setDiemHocPhan(double diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }
    
    public String xepHang(){
        double diemTongKet = diemQuaTrinh*0.3+ diemHocPhan*0.7;
        if(diemTongKet <4.0)
            return "F";
        else if(diemTongKet >=4 && diemTongKet <5)
            return "D";
        else if(diemTongKet >=5 && diemTongKet <6)
            return "C";
        else if(diemTongKet >=6 && diemTongKet <8.5)
            return "B";       
        return "A";
                  
        
    }
    @Override
    public String toString() {
        return super.toString() + ", chuyenNghanh=" + chuyenNghanh + ", diemQuaTrinh=" + diemQuaTrinh + ", diemHocPhan=" + diemHocPhan + '}';
    }
    
    
}

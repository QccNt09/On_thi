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
public class ThiSinhKhoiA extends ThiSinh{
    private double diemToan, diemLy, diemHoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(double diemToan, double diemLy, double diemHoa) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public ThiSinhKhoiA(double diemToan, double diemLy, double diemHoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    public double tongDiem(){
        return diemToan+diemLy+diemHoa;
    }
            
    @Override
    public void nhapTT(){
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem toan: ");
        diemToan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem ly: ");
        diemLy = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem hoa: ");
        diemHoa = Integer.parseInt(sc.nextLine());
    }
    public String toString() {
        return super.toString() + ", Diem toan: " + diemToan + ", Diem ly: " + diemLy + ", Diem hoa: " + diemHoa ;
    }
    
    
}

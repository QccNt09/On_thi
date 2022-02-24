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
public class KhachHang {
    private String maKH, tenKH,xa,huyen,tinh;
    private double tongSoDu;
    private int solanGiaoDich;
    ArrayList<TaiKhoanNganHang> listtk = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String xa, String huyen, String tinh) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    public KhachHang(String maKH, String tenKH, String xa, String huyen, String tinh, double tongSoDu) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
        this.tongSoDu = tongSoDu;
    }

    public KhachHang(String maKH, String tenKH, String xa, String huyen, String tinh, double tongSoDu, int solanGiaoDich) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
        this.tongSoDu = tongSoDu;
        this.solanGiaoDich = solanGiaoDich;
    }
    

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public double getTongSoDu() {
        return tongSoDu;
    }

    public void setTongSoDu(double tongSoDu) {
        this.tongSoDu = tongSoDu;
    }

    public int getSolanGiaoDich() {
        return solanGiaoDich;
    }

    public void setSolanGiaoDich(int solanGiaoDich) {
        this.solanGiaoDich = solanGiaoDich;
    }
    
    public void nhapTTKH(){
        
        System.out.println("Nhap ma khach hang: ");
        maKH = sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        tenKH = sc.nextLine();
        System.out.println("Nhap xa: ");
        xa = sc.nextLine();
        System.out.println("Nhap huyen: ");
        huyen = sc.nextLine();
        System.out.println("Nhap tinh: ");
        tinh = sc.nextLine();
                
    }
    public TaiKhoanNganHang timTK(String STK){
        for(int i = 0; i <listtk.size(); i++){
            if(listtk.get(i).getSTK().equalsIgnoreCase(STK)){
                return listtk.get(i);
            }
        }
        return null;
    }
    public void nhapTKvaoKH(){
        while(true){
            TaiKhoanNganHang tk = new TaiKhoanNganHang();
            listtk.add(tk);
            System.out.println("Co muon nhap tiep khong?Y or N ");
            if(sc.nextLine().equals("N"))
                break;           
        }
    }
    public TaiKhoanNganHang timTKcoSoDuLonNhat(){
        double max = listtk.get(0).getSodu();
        int vt = 0;
        for(int i = 0; i<listtk.size(); i++){
            if(listtk.get(i).getSodu()>max){
                max = listtk.get(i).getSodu();
                vt = i;
            }          
        }
        return listtk.get(vt);       
    }
    public void tongsoTien(){
        double tong =0; 
        for(int i = 0; i <listtk.size(); i++){
            tong+= listtk.get(i).getSodu();          
        }
        tongSoDu = tong; 
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + ", tongSoDu=" + tongSoDu + ", solanGiaoDich=" + solanGiaoDich + ", listtk=" + listtk + ", sc=" + sc + '}';
    }
    
    
    
}

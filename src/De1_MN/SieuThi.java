/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_MN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SieuThi  {
    ArrayList<SanPham> listsp = new ArrayList<>();
    ArrayList<KhachHang> listkh = new ArrayList<>();
    ArrayList<HoaDon> listhd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    
    public void nhapSP(){
        while(true){
            SanPham s = new SanPham();
            s.nhapsp();
            int vt = timkiemSP(s.getMsp());
            if(vt>=0){
                listsp.get(vt).setSoLuong(listsp.get(vt).getSoLuong()+s.getSoLuong());
            }
            else
                listsp.add(s);
            System.out.println("Co muon nhap tiep khong? Y or N");
            if(sc.nextLine().equalsIgnoreCase("N")) break;
        
        }
    }
    public void nhapthemKH(){
        KhachHang k = new KhachHang();
        k.nhapTT();
        listkh.add(k);
    }
    
    public int timkiemSP(int maSP){
        for(int i = 0; i<listsp.size();i++){
            if(listsp.get(i).getMsp() == maSP)
                return i;
        }
        return -1;
    }
    public int timkiemKH(int maKH){
        for(int i = 0; i<listkh.size();i++){
            if(listkh.get(i).getMkh() == maKH)
                return i;
        }
        return -1;
    }
    public void doiTTKH(){
        System.out.println("Nhap ma khach hang can sua: ");
        int maKH = Integer.parseInt(sc.nextLine());
        int vt = timkiemKH(maKH);
        if(vt >=0){
            System.out.println("Nhap ten moi or nam sinh moi");
            String s = sc.nextLine();
            try {
                int namSinh = Integer.parseInt(s);
                listkh.get(vt).doiNamSinh(namSinh);

            } catch (Exception e) {
                listkh.get(vt).doiTen(s);

            }
        }else{
            System.out.println("Khong tim thay khach hang");
        }
    
    }
    public void inDanhSachSP(){
        for(SanPham x : listsp){
            System.out.println(x.toString());
        }
    }
    public void muaHang(){
        System.out.println("Nhap ma khach hang muon mua: ");
        int mkh = Integer.parseInt(sc.nextLine());
        HoaDon h = new HoaDon();
        h.setMakh(mkh);
        while(true){
            System.out.println("Nhap ma san pham can mua: ");
            int msp = Integer.parseInt(sc.nextLine());
            int vt = timkiemSP(msp);
            if(vt>=0){
                System.out.println("Nhap so luong: ");
                int sl = Integer.parseInt(sc.nextLine());  
                SanPham spcu = listsp.get(vt);
                SanPham sp = new SanPham(spcu.getMsp(), spcu.getTenSP(), spcu.getDonGia(), spcu.getNgaySX(), sl);
                h.listsp.add(sp);
                listsp.get(vt).setSoLuong(listsp.get(vt).getSoLuong()-sl);
                
                
            }
            else
                System.out.println("Khong tim thay san pham can mua");
                
            System.out.println("Co muon nhap tiep khong? Y or N");
            if(sc.nextLine().equalsIgnoreCase("N")) break;
        
        }
        listhd.add(h);
    }
    
    public void tongTien(){
        for(int i = 0 ; i<listkh.size(); i++){
            double tong = 0;
            for(int j = 0; j<listhd.size(); j++){
                if(listhd.get(j).getMakh() == listkh.get(i).getMkh())
                    tong+=listhd.get(j).tongTien();
            }
            listkh.get(i).setTongTien(tong);
        }
    }
    public void sapXep(){
        tongTien();
        listkh.sort(((o1, o2) -> Double.compare(o1.getTongTien(), o2.getTongTien())));
    
    }
    public void inKH(){
        for(KhachHang k : listkh){
            System.out.println(k.toString());
        }
    }
    
}

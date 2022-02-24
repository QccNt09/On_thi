/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_MN;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    ArrayList <SanPham> listsp = new ArrayList<>();
    private int makh;

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }
    public double tongTien(){
        double tong = 0;
        for(int i = 0; i<listsp.size(); i++){
            tong += listsp.get(i).thanhTien();
        }
        return tong;
    }
    
    
    
    
}

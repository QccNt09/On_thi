/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_MN;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        SieuThi st = new SieuThi();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Menu \n");
        System.out.printf("1.Sieu thi nhap san pham.\n");
        System.out.printf("2.Sieu thi co the them mot khach hang bat ki.\n");
        System.out.printf("3.Thay doi ten hoac nam sinh cua khach hang co ma hang tuong ung.\n");
        System.out.printf("4.In danh sach cac san pham ra man hinh ma sieu thi co.\n");
        System.out.printf("5.Khach hang mua san pham.\n");
        System.out.printf("6.Sap xep theo thu tu tang dan so tien ma khach hang da mua va in cac khach hang nay ra man hinh.\n");
        System.out.printf("7.Thoat\n");
        while(true){
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon){ 
                case 1: 
                    st.nhapSP();
                    System.out.println("Da nhap xong san pham");
                    break;
                case 2: 
                    st.nhapthemKH();
                    System.out.println("Da nhap them khach hang");
                    break;
                case 3: 
                    st.doiTTKH();
                    System.out.println("Da doi thong tin khach hang");
                    break;
                case 4: 
                    System.out.println("Danh sach san pham");
                    st.inDanhSachSP();                     
                    break;
                case 5: 
                    st.muaHang();
                    System.out.println("Da mua hang xong");
                    break;
                case 6:                    
                    st.sapXep();
                    st.inKH();
                    break;
                case 7: break;
                default: System.out.println("Khong co lua chon nay! Moi nhap lai");

            }
        }
//        st.nhapSP();
//        st.inDanhSachSP();
//        st.nhapthemKH();
//        st.nhapthemKH();
////        st.nhapthemKH();
//        
//        st.doiTTKH();
//        st.inKH();
//        st.muaHang();
//        st.inDanhSachSP();
        
        
    }
    
}

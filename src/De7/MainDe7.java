/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MainDe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinhKhoiA> listA = new ArrayList<>();
        ArrayList<ThiSinhKhoiC> listC = new ArrayList<>();
        ThiSinhKhoiA tsA = new ThiSinhKhoiA();
        ThiSinhKhoiC tsC = new ThiSinhKhoiC();
        System.out.println("Nhap so luong thi sinh: ");
        int n = Integer.parseInt(sc.nextLine()); 
        for(int i = 0; i<n; i++){
             tsA.nhapTT();
             listA.add(tsA);
             tsC.nhapTT();
             listC.add(tsC);            
        }

        for(int i = 0; i <listA.size(); i++){
            if(listA.get(i).tongDiem() <20){
                listA.remove(i);    
            }
            else if( listC.get(i).tongDiem() <20)
                listC.remove(i);
        }
        for(ThiSinhKhoiA x : listA){
            System.out.println(x.toString());
        }
        for(ThiSinhKhoiC x : listC){
            System.out.println(x.toString());
        }
    }
    
}

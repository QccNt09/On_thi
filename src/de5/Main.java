/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <NhanVien> listNV = new ArrayList<>();
        try {
            File f = new File("nhanvien.dat");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while(s  != null){
                String[] arr = new String[7];
                String tmp = "";
                int count = 0;
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == '$'){
                        arr[count] = tmp;
                        count++;
                        tmp ="";      
                    }
                    else
                        tmp +=s.charAt(i);
                }
                arr[count] = tmp;
                
                NhanVien nv = new NhanVien(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),Double.parseDouble(arr[5]),arr[6]);
                listNV.add(nv);
                s = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
             e.printStackTrace();
        }
        for(NhanVien x : listNV){
            System.out.println(x.toString());
        }
        
    }
    
    
}

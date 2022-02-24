/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Mainde5 {
    public static void main(String[] args) {
        ArrayList <NhanVien> listnv = new ArrayList<>();
        
        try {
            File f = new File("nhanvien.dat");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while((s = br.readLine()) != null){
                String[] arr = s.split("\\$");
                NhanVien nv = new NhanVien(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),Double.parseDouble(arr[5]),arr[6]);
                listnv.add(nv);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(NhanVien x : listnv){
            System.out.println(x.toString());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De6;

import java.io.FileWriter;

/**
 *
 * @author ADMIN
 */
public class DocFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("testout.txt");
            fw.write("Welcome to java.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

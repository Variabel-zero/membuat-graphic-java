/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satriawan;

import javax.swing.JFrame;

/**
 *
 * @author Satriawan
 */
public class Utama {
    //mengeksekusi aplikasi
    public static void main (String args[]){
        //menciptakan frame untuk panel ini
        JFrame frame = new JFrame("Menggunkan warna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        WarnaJpanel panggil = new WarnaJpanel();
        frame.add(panggil);//menambahkan pada frame ini
        frame.setSize(500,200);
        frame.setVisible(true);//menampilkan frame
    }
    
}

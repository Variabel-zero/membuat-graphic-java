/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satriawan;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
/**
 *
 * @author Satriawan
 */
public class WarnaJpanel extends JPanel{
    public void paintComponent( Graphics g){
        super.paintComponent(g);//memanggil paintComponen dari superkelas
        
        this.setBackground(Color.WHITE);
        
        //menetapkan warna pengambaran baru dengan integer;
        g.setColor(new Color(255,0,0));
        g.fillRect(15,25,100,20);
        g.drawString("RGB sekarang : "+g.getColor(), 130, 40);
        
        //menetapkan warna penggambaran baru dengan float
        g.setColor(new Color(0.05f,0.75f,0.0f));
        g.fillRect(15,50,100,20);
        g.drawString("RGB sekarang : "+g.getColor(), 130, 65);
        
        //membuat warna penggambaran menggunakan objek static Color
        g.setColor(Color.BLUE);
        g.fillRect(15,75,100,20);
        g.drawString("RGB sekarang : "+g.getColor(), 130, 90);
        
        
        //menampilkan nilai-nilai RGB indivial
        Color warna = Color.MAGENTA;
        g.setColor(warna);
        g.fillRect(15,100,100,20);
        g.drawString("Nilai - nilai RGB : "+warna.getRed()+", "+warna.getGreen()+", "+warna.getBlue(),130,115);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SepedaDemoMain1841720193Lintang {  
    
    public static void main(String[] args)
    {
        // Buat dua buah objek sepeda
        Sepeda1841720193Lintang spd1 = new Sepeda1841720193Lintang();
        Sepeda1841720193Lintang spd2 = new Sepeda1841720193Lintang();
    
        // Panggil method didalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
    }
}
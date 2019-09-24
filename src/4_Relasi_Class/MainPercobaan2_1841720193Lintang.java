/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan2_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class MainPercobaan2_1841720193Lintang {
    
    public static void main(String[] args) {
        Mobil1841720193Lintang m = new Mobil1841720193Lintang();
        m.setmMerkLintang("Avanza");
        m.setmBiayaLintang(350000);
        Sopir1841720193Lintang s = new Sopir1841720193Lintang();
        s.setmNamaLintang("Jane Doe");
        s.setmBiayaLintang(200000);
        
        Pelanggan1841720193Lintang p = new Pelanggan1841720193Lintang();
        p.setmNamaLintang("Jane Doe");
        p.setmMobilLintang(m);
        p.setmSopirLintang(s);
        p.setmHariLintang(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalLintang());
    }
}

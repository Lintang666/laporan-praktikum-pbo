/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan1_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class MainPercobaan1_1841720193Lintang {
    
    public static void main(String[] args){
        Processor1841720193Lintang p = new Processor1841720193Lintang("Intel i5", 3);
        Laptop1841720193Lintang L = new Laptop1841720193Lintang("Thinkpad", p);

        L.infoLintang();
        
        Processor1841720193Lintang p1 = new Processor1841720193Lintang();
        p1.setmMerkLintang("Intel i5");
        p1.setmCacheLintang(4);
        Laptop1841720193Lintang L1 = new Laptop1841720193Lintang();
        L1.setmMerkLintang("Thinkpad");
        L1.setmProcLintang(p1);
        L1.infoLintang();
    }
}

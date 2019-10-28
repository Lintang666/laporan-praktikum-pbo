/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass1841720193lintang;

/**
 *
 * @author ASUS
 */
public class ProgramMain1841720193Lintang {
     public static void main(String[] args){
        Kucing1841720193Lintang Kucingkampung = new Kucing1841720193Lintang();
        Ikan1841720193Lintang Lumbalumba = new Ikan1841720193Lintang();
        
        Orang1841720193Lintang ani = new Orang1841720193Lintang("Ani");
        Orang1841720193Lintang Budi = new Orang1841720193Lintang("Budi");
        
        ani.peliharaHewanLintang(Kucingkampung);
        Budi.peliharaHewanLintang(Lumbalumba);
        
        
        ani.ajakPeliharaanJalanJalanLintang();
        Budi.ajakPeliharaanJalanJalanLintang();
        
    }
}

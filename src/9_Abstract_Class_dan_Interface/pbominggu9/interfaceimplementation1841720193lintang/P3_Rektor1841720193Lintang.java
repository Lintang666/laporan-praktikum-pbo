/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.interfaceimplementation1841720193lintang;

/**
 *
 * @author ASUS
 */
public class P3_Rektor1841720193Lintang {
     public void beriSertifikatCumlaudeLintang(P3_ICumlaude1841720193Lintang P3_Mahasiswa1841720193Lintang){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        P3_Mahasiswa1841720193Lintang.lulusLintang();
        P3_Mahasiswa1841720193Lintang.meraihIPKTinggiLintang();
        
        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapresLintang(P3_IBerprestasi1841720193Lintang P3_Mahasiswa1841720193Lintang){
        System.out.println("Saya REKTOR,memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        P3_Mahasiswa1841720193Lintang.menjuaraiKompetisiLintang();
        P3_Mahasiswa1841720193Lintang.membuatPublikasiIlmiahLintang();
        
        System.out.println("---------------------------------------------");
    }
}

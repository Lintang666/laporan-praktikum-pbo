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
public class P3_Sarjana1841720193Lintang extends P3_Mahasiswa1841720193Lintang implements P3_ICumlaude1841720193Lintang,P3_IBerprestasi1841720193Lintang{

    public P3_Sarjana1841720193Lintang(String nama) {
        super(nama);
    }

    
    @Override
    public void lulusLintang() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiLintang() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }

    @Override
    public void menjuaraiKompetisiLintang() {
        System.out.println("AUTO JUARA DUNIA DONGGG");    }

    public void membuatPublikasiIlmiahLintang() {
        System.out.println("Saya telah menerbitkan Jurnalisa Kelas INTERNASIONAL");
    }   
}

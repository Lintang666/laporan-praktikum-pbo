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
public class P3_PascaSarjana1841720193Lintang extends P3_Mahasiswa1841720193Lintang implements P3_ICumlaude1841720193Lintang,P3_IBerprestasi1841720193Lintang{

    public P3_PascaSarjana1841720193Lintang(String nama) {
        super(nama);
    }

    
    
    @Override
    public void menjuaraiKompetisiLintang() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiahLintang() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    } 

    @Override
    public void lulusLintang() {
        super.lulusLintang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggiLintang() {
        super.meraihIPKTinggiLintang(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

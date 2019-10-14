/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasoverriding1841720193lintang;

/**
 *
 * @author ASUS
 */
public class OverridingMain1841720193Lintang {
    public static void main(String[] args) {
        Manusia1841720193Lintang m = new Manusia1841720193Lintang();
        Dosen1841720193Lintang d   = new Dosen1841720193Lintang();
        Mahasiswa1841720193Lintang mhs = new Mahasiswa1841720193Lintang();
        
        m.makanLintang();
        m.bernafasLintang();
        d.makanLintang();
        d.lemburLintang();
        mhs.makanLintang();
        mhs.tidurLintang();
    }
}

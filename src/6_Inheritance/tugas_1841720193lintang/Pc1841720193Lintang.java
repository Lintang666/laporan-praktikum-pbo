/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Pc1841720193Lintang extends Komputer1841720193Lintang{
    public int ukuranMonitor;
    
    Pc1841720193Lintang() {
        
    }
    
    public Pc1841720193Lintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPcLintang() {
        super.tampilDataLintang();
        System.out.println("Ukuran Monitor : " + ukuranMonitor);
    }
}

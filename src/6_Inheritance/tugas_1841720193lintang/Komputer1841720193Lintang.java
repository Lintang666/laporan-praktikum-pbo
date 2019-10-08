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
public class Komputer1841720193Lintang {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    Komputer1841720193Lintang() {
        
    }
    
    public Komputer1841720193Lintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilDataLintang() {
        System.out.println("Merk : " + merk);
        System.out.println("Kecepatan Processor : " + kecProsesor);
        System.out.println("Size Memory : " + sizeMemory);
        System.out.println("Jenis Processor : " + jnsProsesor);
    }
}

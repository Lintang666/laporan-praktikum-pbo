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
public class Leptop1841720193Lintang extends Komputer1841720193Lintang{
    public String jnsBatrei;
    
    Leptop1841720193Lintang() {
        
    }
    
    public Leptop1841720193Lintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLeptopLintang() {
        super.tampilDataLintang();
        System.out.println("Jenis Batrai : " + jnsBatrei);
    }
}

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
public class Mac1841720193Lintang extends Leptop1841720193Lintang{
    public String security;
    
    Mac1841720193Lintang() {
        
    }
    
    public Mac1841720193Lintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    
    public void tampilMacLintang() {
        super.tampilLeptopLintang();
        System.out.println("Security : " + security);
    }
}

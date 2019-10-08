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
public class Windows1841720193Lintang extends Leptop1841720193Lintang {
    public String fitur;
    
    Windows1841720193Lintang() {
        
    }
    
    public Windows1841720193Lintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    public void tampilWindowsLintang() {
        super.tampilLeptopLintang();
        System.out.println("Fitur : " + fitur);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Tabung1841720193Lintang extends Bangun1841720193Lintang{
    protected int t;
    
    public void setSuperPhiLintang(double phi) {
        super.phi = phi;
    }
    
    public void setSuperRLintang(int r) {
        super.r = r;
    }
    
    public void setTLintang(int t) {
        this.t = t;
    }
    
    public void volumeLintang() {
        System.out.println("Volume Tabung adalah : " + (super.phi * super.r * super.r * this.t));
    }
}

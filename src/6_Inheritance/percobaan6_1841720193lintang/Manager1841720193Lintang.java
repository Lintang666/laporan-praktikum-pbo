/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan6_1841720193lintang;
/**
 *
 * @author ASUS
 */
public class Manager1841720193Lintang extends Karyawan1841720193Lintang{
    public int tunjangan;
    
    public Manager1841720193Lintang() {
        
    }
    
    public void tampilDataManagerLintang() {
        super.tampilDataKaryawanLintang();
        System.out.println("Tunjangan       : " + tunjangan);
        System.out.println("Total Gaji      : " + (super.gaji + tunjangan));
    }
}

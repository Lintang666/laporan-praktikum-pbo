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
public class Inheritance1_1841720193Lintang {
    public static void main(String[] args) {
        StaffTetap1841720193Lintang ST = new StaffTetap1841720193Lintang("Budi", "Malang", "Lakilaki", 20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetapLintang();
        
        StaffHarian1841720193Lintang SH = new StaffHarian1841720193Lintang("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarianLintang();
    }

}

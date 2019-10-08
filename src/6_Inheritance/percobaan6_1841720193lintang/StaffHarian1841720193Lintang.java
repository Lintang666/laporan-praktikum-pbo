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
public class StaffHarian1841720193Lintang extends Staff1841720193Lintang{
    public int jmlJamKerja;

        public StaffHarian1841720193Lintang() {
        }
    
    public StaffHarian1841720193Lintang(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    
     public void tampilStaffHarianLintang() {
        System.out.println("===============Data Staff Harian===============");
        super.tampilDataStaffLintang();
        System.out.println("Jumlah Jam Kerja    : " + jmlJamKerja);
        System.out.println("Gaji Bersih         : " + (gaji * jmlJamKerja + lembur - potongan));
    }
}

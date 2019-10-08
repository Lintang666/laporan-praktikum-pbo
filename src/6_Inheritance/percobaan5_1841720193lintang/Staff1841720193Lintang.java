/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5_1841720193lintang;

/**
 *
 * @author ASUS
 */    
public class Staff1841720193Lintang extends Karyawan1841720193Lintang {
    public int lembur, potongan;
    
    public Staff1841720193Lintang() {
        
    }
    
    public Staff1841720193Lintang(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffLintang() {
        super.tampilDataKaryawanLintang();
        System.out.println("Lembur          : " + lembur);
        System.out.println("Potongan        : " + potongan);
        System.out.println("Total Gaji      : " + (gaji + lembur - potongan));
    }
}

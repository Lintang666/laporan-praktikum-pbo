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
public class Inheritance1_1841720193Lintang {
    public static void main(String[] args) {
        Manager1841720193Lintang M = new Manager1841720193Lintang();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolita";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManagerLintang();
        
        Staff1841720193Lintang S = new Staff1841720193Lintang();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaffLintang();
    }
}

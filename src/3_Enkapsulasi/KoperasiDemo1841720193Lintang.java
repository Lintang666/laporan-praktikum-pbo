/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter1841720193lintang;

/**
 *
 * @author ASUS
 */
public class KoperasiDemo1841720193Lintang {
    public static void main(String[] args) {
        Anggota1841720193Lintang anggota1 = new Anggota1841720193Lintang("Iwan","Jalan Mawar");
        System.out.println("Simpanan " +anggota1.getNamaLintang()+ " : Rp "+anggota1.getSimpananLintang());
        
        anggota1.setNamaLintang("Iwan Setiawan");
        anggota1.setAlamatLintang("Jalan Sukarno Hatta no 10");
        anggota1.setorLintang(100000);
        System.out.println("Simpanan " +anggota1.getNamaLintang()+ " : Rp "+anggota1.getSimpananLintang());
        
        anggota1.pinjamLintang(5000);
        System.out.println("Simpanan " +anggota1.getNamaLintang()+ " : Rp "+anggota1.getSimpananLintang());
    }
}

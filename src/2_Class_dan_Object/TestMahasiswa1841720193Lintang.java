package percobaan;


import percobaan.Mahasiswa1841720193Lintang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TestMahasiswa1841720193Lintang {
    public static void main (String args[]) {
        Mahasiswa1841720193Lintang mhs1=new Mahasiswa1841720193Lintang();
        Mahasiswa1841720193Lintang mhs2=new Mahasiswa1841720193Lintang();
        Mahasiswa1841720193Lintang mhs3=new Mahasiswa1841720193Lintang();
        
        mhs1.mNim=1841720193;
        mhs1.mNama="Lintang Kusuma Adjie";
        mhs1.mAlamat="Kota Batu";
        mhs1.mKelas="TI 2D";
        mhs1.tampilBiodataLintang();
        
        System.out.println("");
                
        mhs2.mNim=1841720194;
        mhs2.mNama="Ericko Lim";
        mhs2.mAlamat="Jakarta";
        mhs2.mKelas="TI 2D";
        mhs2.tampilBiodataLintang();
        
        System.out.println("");
                
        mhs3.mNim=1841720195;
        mhs3.mNama="Yosiolo";
        mhs3.mAlamat="Jakarta";
        mhs3.mKelas="TI 2D";
        mhs3.tampilBiodataLintang();       
    }
}
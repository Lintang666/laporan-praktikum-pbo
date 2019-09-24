/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan3_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class KeretaApi1841720193Lintang {
    
    private String mNama;
    private String mKelas;
    private Pegawai1841720193Lintang mMasinis;
    private Pegawai1841720193Lintang mAsisten;

    public KeretaApi1841720193Lintang() {
    }

    public KeretaApi1841720193Lintang(String mNama, String mKelas, Pegawai1841720193Lintang mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720193Lintang(String mNama, String mKelas, Pegawai1841720193Lintang mMasinis, Pegawai1841720193Lintang mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720193Lintang getmMasinis() {
        return mMasinis;
    }

    public void setmMasinis(Pegawai1841720193Lintang mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720193Lintang getmAsisten() {
        return mAsisten;
    }

    public void setmAsisten(Pegawai1841720193Lintang mAsisten) {
        this.mAsisten = mAsisten;
    }
    
    public String InfoLintang() {
        String InfoLintang = "";
        InfoLintang += "Nama: " + this.mNama + "\n"; 
        InfoLintang += "Kelas: " + this.mKelas + "\n"; 
        InfoLintang += "Masinis: " + this.mMasinis.InfoLintang() + "\n"; 
        InfoLintang += "Asisten: " + this.mAsisten.InfoLintang() + "\n"; 
        return InfoLintang; 
    }
}



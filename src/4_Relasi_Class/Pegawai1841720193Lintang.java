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
public class Pegawai1841720193Lintang {
    private String mNip;
    private String mNama;

    public Pegawai1841720193Lintang() {
    }
 
    public Pegawai1841720193Lintang(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }
    
    public void setNipLintang(String mNip) {
        this.mNip = mNip;
    }
    
    public String getNipLintang() {
        return mNip;
    }
    
    public void setNamaLintang(String mNama) {
        this.mNama = mNama;
    }
    
    public String getNamaLintang() {
        return mNama;
    }
    
    public String InfoLintang() { 
        String InfoLintang = ""; 
        InfoLintang += "Nip: " + this.mNip + "\n"; 
        InfoLintang += "Nama: " + this.mNama + "\n"; 
        return InfoLintang; 
    }
}
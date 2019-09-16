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
public class Anggota1841720193Lintang {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;
    
    Anggota1841720193Lintang(String nama, String alamat){
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }
    
    public void setNamaLintang(String nama){
        this.mNama = nama;
    }
    public void setAlamatLintang(String alamat){
        this.mAlamat = alamat;
    }
    public String getNamaLintang(){
        return mNama;
    }
    public String getAlamatLintang(){
        return mAlamat;
    }
    public float getSimpananLintang(){
        return mSimpanan;
    }
    public void setorLintang(float uang){
        mSimpanan +=uang;
    }
    public void pinjamLintang(float uang){
        mSimpanan -=uang;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan2_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Sopir1841720193Lintang {
    private String mNama;
    private int mBiaya;
    
    public Sopir1841720193Lintang() {
        
    }
    
    public int hitungBiayaSopirLintang(int mHari) {
        return mBiaya * mHari;
    }

    public String getmNamaLintang() {
        return mNama;
    }

    public void setmNamaLintang(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaLintang() {
        return mBiaya;
    }

    public void setmBiayaLintang(int mBiaya) {
        this.mBiaya = mBiaya;
    }
}
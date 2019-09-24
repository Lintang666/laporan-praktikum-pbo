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
public class Mobil1841720193Lintang {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720193Lintang() {
    }

    public String getmMerkLintang() {
        return mMerk;
    }

    public void setmMerkLintang(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmBiayaLintang() {
        return mBiaya;
    }

    public void setmBiayaLintang(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaMobilLintang(int  mHari){
        return mBiaya* mHari;
    }
}

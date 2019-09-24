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
public class Pelanggan1841720193Lintang {
    private String mNama;
    private Mobil1841720193Lintang mMobil;
    private Sopir1841720193Lintang mSopir;
    private int mHari;

    public Pelanggan1841720193Lintang() {
    }

    public String getmNamaLintang() {
        return mNama;
    }

    public void setmNamaLintang(String mNama) {
        this.mNama = mNama;
    }

    public Mobil1841720193Lintang getmMobilLintang() {
        return mMobil;
    }

    public void setmMobilLintang(Mobil1841720193Lintang mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720193Lintang getmSopirLintang() {
        return mSopir;
    }

    public void setmSopirLintang(Sopir1841720193Lintang mSopir) {
        this.mSopir = mSopir;
    }

    public int getmHariLintang() {
        return mHari;
    }

    public void setmHariLintang(int mHari) {
        this.mHari = mHari;
    }

    public int hitungBiayaTotalLintang() {
        return mMobil.hitungBiayaMobilLintang(mHari) + mSopir.hitungBiayaSopirLintang(mHari);
    }
}

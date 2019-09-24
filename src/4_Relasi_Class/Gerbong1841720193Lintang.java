/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan4_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Gerbong1841720193Lintang {
    private String mKode;
    private Kursi1841720193Lintang[] mArrayKursi;
    
    public Gerbong1841720193Lintang(String kode, int jumlah){
        this.mKode = kode;
        this.mArrayKursi = new Kursi1841720193Lintang[jumlah];
        this.initKursiLintang();
    }
    public void setPenumpangLintang(Penumpang1841720193Lintang mPenumpang, int mNomor){
        this.mArrayKursi[mNomor - 1].setmPenumpangLintang(mPenumpang);
    }

    public String getmKodeLintang() {
        return mKode;
    }

    public void setmKodeLIntang(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720193Lintang[] getmArrayKursiLintang() {
        return mArrayKursi;
    }

    public void setmArrayKursiLintang(Kursi1841720193Lintang[] mArrayKursi) {
        this.mArrayKursi = mArrayKursi;
    }
    private void initKursiLintang(){
        for(int i=0; i<mArrayKursi.length; i++){
            this.mArrayKursi[i] = new Kursi1841720193Lintang(String.valueOf(i+1));
        }
    }
    
    public String infoLintang(){
        String infoLintang ="";
        infoLintang += "Kode ; " + mKode + "\n";
        for(Kursi1841720193Lintang kursi : mArrayKursi){
            infoLintang += kursi.infoLintang();
        }
        return infoLintang;
    }
}

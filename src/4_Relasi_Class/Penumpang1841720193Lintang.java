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
public class Penumpang1841720193Lintang {
     private String mKtp, mNama;

    public Penumpang1841720193Lintang(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getmKtpLintang() {
        return mKtp;
    }

    public void setmKtpLintang(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNamaLintang() {
        return mNama;
    }

    public void setmNamaLintang(String mNama) {
        this.mNama = mNama;
    }

    public String infoLintang(){
        String infoLintang = " ";
        infoLintang += "KTP : " +mKtp+ "\n";
        infoLintang += "Nama : " +mNama+ "\n";
        return infoLintang;
    }

}

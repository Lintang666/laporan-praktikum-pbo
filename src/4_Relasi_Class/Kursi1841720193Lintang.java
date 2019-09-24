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
public class Kursi1841720193Lintang {
    private String mNomor;
    private Penumpang1841720193Lintang mPenumpang;

    public Kursi1841720193Lintang(String mNomor) {
        this.mNomor = mNomor;
    }

    public String getmNomorLintang() {
        return mNomor;
    }

    public void setmNomorLintang(String mNomor) {
        this.mNomor = mNomor;
    }

    public Penumpang1841720193Lintang getmPenumpangLintang() {
        return mPenumpang;
    }

    public void setmPenumpangLintang(Penumpang1841720193Lintang mPenumpang) {
        this.mPenumpang = mPenumpang;
    }
    
    public String infoLintang(){
        String infoLintang="";
        infoLintang+="Nomer : "+mNomor+"\n";
        if (this.mPenumpang!=null){
            infoLintang += "Penumpang : \n"+mPenumpang.infoLintang()+ "\n";
        }
        return infoLintang;
    }
}

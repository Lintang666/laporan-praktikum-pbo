/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan1_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Laptop1841720193Lintang {
    private String mMerk; 
    private Processor1841720193Lintang mProc;

    public Laptop1841720193Lintang() {
    }

    public Laptop1841720193Lintang(String mMerk, Processor1841720193Lintang mProc) {
        this.mMerk = mMerk;
        this.mProc = mProc;
    }

    public String getmMerkLintang() {
        return mMerk;
    }

    public void setmMerkLintang(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720193Lintang getmProcLintang() {
        return mProc;
    }

    public void setmProcLintang(Processor1841720193Lintang mProc) {
        this.mProc = mProc;
    }
    
    public void infoLintang() { 
        System.out.println("Merk Laptop = " + mMerk); 
        mProc.infoLintang(); 
    }
}

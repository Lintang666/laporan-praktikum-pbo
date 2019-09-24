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
public class Processor1841720193Lintang {
    private String mMerk;
    private double mCache;

    public Processor1841720193Lintang() {
    }

    public Processor1841720193Lintang(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }

    public String getmMerkLintang() {
        return mMerk;
    }

    public void setmMerkLintang(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCacheLintang() {
        return mCache;
    }

    public void setmCacheLintang(double mCache) {
        this.mCache = mCache;
    }
    
    public void infoLintang() {
         System.out.printf("Merk Processor = %s\n", mMerk); 
         System.out.printf("Cache Memory = %.2f\n", mCache);  
    }
}

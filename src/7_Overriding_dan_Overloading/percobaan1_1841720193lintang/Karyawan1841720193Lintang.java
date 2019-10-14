/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Karyawan1841720193Lintang {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNamaLintang(String mNama)
    {
        this.mNama=mNama;
    }
    public void setmNipLintang(String mNip)
    {
        this.mNip=mNip;
    }
    public void setmGolonganLintang(String mGolongan)
    {
        this.mGolongan=mGolongan;
        
        switch(mGolongan.charAt(0)){
            case '1':this.mGaji=5000000;
              break;
            case '2':this.mGaji=3000000;
              break;
            case '3':this.mGaji=2000000;
              break;
            case '4':this.mGaji=1000000;
              break;
            case '5':this.mGaji=750000;
              break;
        }
    }
    public void setmGajiLintang(double mGaji)
    {
        this.mGaji=mGaji;
    }
    public String getmNamaLintang() {
        return mNama;
    }
    public String getmNipLintang() {
        return mNip;
    }
    public String getmGolonganLintang() {
        return mGolongan;
    }
    public double getmGajiLintang() {
        return mGaji;
    }
}

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
public class Staff1841720193Lintang extends Karyawan1841720193Lintang {
    private int mLembur;
    private double mGajiLembur;

    public void setmLemburLintang(int mLembur) {
        this.mLembur = mLembur;
    }
    public int getmLemburLintang() {
        return mLembur;
    }
    public void setmGajiLemburLintang(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }
    public double getmGajiLemburLintang() {
        return mGajiLembur;
    }
    public double getmGajiLintang(int lembur,double gajiLembur){
        return super.getmGajiLintang()+lembur*gajiLembur;
    }
    public double getmGajiLintang(){
        return super.getmGajiLintang()+mLembur*mGajiLembur;
    }
    public void lihatInfoLintang()
    {
        System.out.println("NIP :"+this.getmNipLintang());
        System.out.println("Nama :"+this.getmNamaLintang());
        System.out.println("Golongan :"+this.getmGolonganLintang());
        System.out.println("Jml Lembur :"+this.getmLemburLintang());
        System.out.printf("Gaji Lembur :%.0f\n",this.getmGajiLemburLintang());
        System.out.printf("Gaji :%.0f\n",this.getmGajiLintang());
    }
}

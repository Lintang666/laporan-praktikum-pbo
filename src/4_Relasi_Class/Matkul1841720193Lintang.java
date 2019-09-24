/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Matkul1841720193Lintang {
    private String mMatkul; 
    private Dosen1841720193Lintang mPengajar;
    private int mSks; 

    public Matkul1841720193Lintang() {
    }

    public Matkul1841720193Lintang(String mMatkul, Dosen1841720193Lintang mPengajar, int mSks) {
        this.mMatkul = mMatkul;
        this.mPengajar = mPengajar;
        this.mSks = mSks;
    }

    public String getmMatkulLintang() {
        return mMatkul;
    }

    public void setmMatkulLintang(String mMatkul) {
        this.mMatkul = mMatkul;
    }

    public Dosen1841720193Lintang getmPengajarLintang() {
        return mPengajar;
    }

    public void setmPengajarLintang(Dosen1841720193Lintang mPengajar) {
        this.mPengajar = mPengajar;
    }

    public int getmSksLintang() {
        return mSks;
    }

    public void setmSksLintang(int mSks) {
        this.mSks = mSks;
    }
   
    public String infoLintang() {         
        String info = ""; 
        info += "Mata Kuliah : " + this.mMatkul + "\n";         
        info += "Dosen Pengajar : \n" + this.mPengajar.infoLintang(); 
        info += "SKS : " + this.mSks + "\n";          
        return info; 
    } 
} 

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
public class Mahasiswa1841720193Lintang {
    private int mNim;     
    private String mNama;     
    private String mKelas; 
    private String mProdi; 

    public Mahasiswa1841720193Lintang() {
    }
     
    public Mahasiswa1841720193Lintang(int mNim, String mNama,  String mKelas, String mProdi) {         
        this.mNim = mNim;         
        this.mNama = mNama;         
        this.mKelas = mKelas;         
        this.mProdi = mProdi; 
    } 
     
    public void setNimLintang(int mNim) { 
        this.mNim = mNim; 
    } 
     
    public int getNimLintang() { 
        return mNim; 
    } 
     
    public void setNamaLintang(String mNama) { 
        this.mNama = mNama; 
    } 
     
    public String getNamaLintang() { 
        return mNama; 
    } 
     
    public void setKelasLintang(String mKelas) { 
        this.mKelas = mKelas; 
    } 
     
    public String getKelasLintang() { 
        return mKelas; 
    } 
    
    public void setProdiLintang(String mProdi) { 
        this.mProdi = mProdi; 
    } 	
     
    public String getProdiLintang() { 
        return mProdi; 
    } 
     
    public String infoLintang() {         
        String info = "";         
        info += "NIM : " + this.mNim + "\n";         
        info += "Nama : " + this.mNama + "\n";         
        info += "Kelas : " + this.mKelas + "\n";         
        info += "Prodi : " + this.mProdi + "\n";         
        return info; 
    } 
} 
 
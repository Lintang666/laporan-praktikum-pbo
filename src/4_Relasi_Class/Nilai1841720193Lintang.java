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
public class Nilai1841720193Lintang {
    private int mNilai; 
    private Mahasiswa1841720193Lintang mMahasiswa;     
    private Dosen1841720193Lintang mDosen;     
    private Matkul1841720193Lintang mMatkul; 

    public Nilai1841720193Lintang() {
    }

    public Nilai1841720193Lintang(Mahasiswa1841720193Lintang mMahasiswa, Dosen1841720193Lintang mDosen, Matkul1841720193Lintang mMatkul, int mNilai) {         
        this.mMahasiswa = mMahasiswa; 
        this.mDosen = mDosen;         
        this.mMatkul = mMatkul;         
        this.mNilai = mNilai; 
    } 
     	
    public void setMahasiswalintang(Mahasiswa1841720193Lintang mMahasiswa) {         
        this.mMahasiswa = mMahasiswa; 
    } 
     
    public Mahasiswa1841720193Lintang getMahasiswaLintang() { 
        return mMahasiswa; 
    } 
     
    public void setDosenLintang(Dosen1841720193Lintang mDosen) {         
        this.mDosen = mDosen; 

        } 
     
    public Dosen1841720193Lintang getDosenLintang() { 
        return mDosen; 
    } 
     
    public void setMatkulLintang(Matkul1841720193Lintang mMatkul) {         
        this.mMatkul = mMatkul; 
    } 
     
    public Matkul1841720193Lintang getMatkulLintang() { 
        return mMatkul; 
    } 
     
    public void setNilaiLintang(int mNilai) { 
        this.mNilai = mNilai; 
    } 
     
    public int getNilaiLintang() { 
        return mNilai; 
    } 
     
    public String infoLintang() {         
        String info = "";         
        info += "NIM : " + this.mMahasiswa.infoLintang() + "\n";         
        info += "MataKuliah : " + this.mMatkul.infoLintang() + "\n";         
        info += "Nilai : " + this.mNilai + "\n";         
        return info; 
    } 
}

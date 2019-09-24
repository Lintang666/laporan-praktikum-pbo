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
public class Dosen1841720193Lintang {
    private String mId; 
    private String mNama; 

    public Dosen1841720193Lintang() {
    }

    public Dosen1841720193Lintang(String mId, String mNama) {         
        this.mId = mId;         
        this.mNama = mNama; 
    } 
     
    public void setIdLintang(String mId) { 
        this.mId = mId; 
    } 
     
    public String getIdLintang() { 
        return mId; 
    } 
     
    public void setNamaLintang(String mNama) { 
        this.mNama = mNama; 
    } 
     
    public String getNamaLintang() { 
        return mNama; 
    } 
     
    public String infoLintang() {         
        String info = ""; 
        info += "ID : " + mId + "\n"; 
        info += "Nama Dosen : " + mNama + "\n";         
        return info; 
    } 
} 

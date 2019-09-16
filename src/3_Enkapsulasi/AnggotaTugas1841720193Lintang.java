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
public class AnggotaTugas1841720193Lintang {
    private String mNomorKTP;
    private String mNama;
    private int mLimitPinjaman;
    private int mJumlahPinjaman;
    
    AnggotaTugas1841720193Lintang(String nomorKTP, String nama, int limitPinjaman){
        this.mNomorKTP = nomorKTP;
        this.mNama = nama;
        this.mLimitPinjaman = limitPinjaman;
    }
    
    public void pinjamLintang(int jmlPinjam){
        if(jmlPinjam > 5000000) {
            System.out.println("Maaf, jumlah pinjam melebihi limit.");
        }else {
            mJumlahPinjaman += jmlPinjam;
        }
    }
    
    public void angsurLintang(int angsur){
        if(angsur < (mJumlahPinjaman*10)/100){
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }else{
            mJumlahPinjaman -= angsur;
            
        }
    }
   
    public String getNamaLintang(){
        return mNama;
    }
    
    public int getLimitPinjamanLintang(){
        return mLimitPinjaman;
    }
    
    public int getJumlahPinjamaanLintang(){
        return mJumlahPinjaman;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class BarangTugas1841720193Lintang {
    public String mKode;
    public String mNamaBarang;
    public int mHargaDasar;
    public float mDiskon;
    
    public int hitungHargaJualLintang(){
        int hargaJual = (int) (mHargaDasar - (mDiskon/100 * mHargaDasar) );
        return hargaJual;
    }
    
    public void tampilDataLintang(){
        System.out.println("Kode : " + mKode);
        System.out.println("namaBarang : " + mNamaBarang);
        System.out.println("Harga Dasar : " + mHargaDasar);
        System.out.println("Diskon : " + mDiskon + "%");
        System.out.println("Harga Jual : " + hitungHargaJualLintang());       
    }
}

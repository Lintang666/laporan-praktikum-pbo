package percobaan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Barang1841720193Lintang {
    public String mNamaBrg;
    public String mJenisBrg;
    public int mStok;
    
    public void tampilBarangLintang(){
    System.out.println ("Nama Barang    : "+mNamaBrg);
    System.out.println ("Jenis Barang   : "+mJenisBrg);
    System.out.println ("Stok           : "+mStok);
    }
    
    //method dengan argumen dan nilai balik (return)
    public int tambahStokLintang(int brgMasuk){
        int stokBaru=brgMasuk+mStok;
        return stokBaru;
    }
}
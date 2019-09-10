package percobaan;




import percobaan.Barang1841720193Lintang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TestBarang1841720193Lintang {
    public static void main (String args[]){
        Barang1841720193Lintang brg1=new Barang1841720193Lintang();
        brg1.mNamaBrg="Yamaha";
        brg1.mJenisBrg="Kendaraan";
        brg1.mStok=10;
        brg1.tampilBarangLintang();
        // menampilkan dan mengisi argumen untuk menambahkan stok barang//
        System.out.println ("Stok Baru adalah " +brg1.tambahStokLintang(20));
        }
}
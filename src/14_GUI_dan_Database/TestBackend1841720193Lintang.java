package frontend;

import backend.*;

/**
 *
 * @author Lintang Kusuma Adjie
 */
public class TestBackend1841720193Lintang {

    public static void main(String[] args) {
        // Kategori
//        Kategori1841720193Lintang kat1 = new Kategori1841720193Lintang("Novel", "Koleksi buku novel");
//        Kategori1841720193Lintang kat2 = new Kategori1841720193Lintang("Referensi", "Buku referensi ilmiah");
//        Kategori1841720193Lintang kat3 = new Kategori1841720193Lintang("Komik", "Komik anak-anak");

        // Anggota
//        Anggota1841720193Lintang agt1 = new Anggota1841720193Lintang("Lintang", "Kabupaten Malang", "0812345679");
//        Anggota1841720193Lintang agt2 = new Anggota1841720193Lintang("Fulan", "Banjarmasin", "0858345637");
//        Anggota1841720193Lintang agt3 = new Anggota1841720193Lintang("Fulanah", "Kota Bandung", "0896345678");

        // Buku
//        Kategori1841720193Lintang novel = new Kategori1841720193Lintang().getByIdLintang(10);
//        Kategori1841720193Lintang referensi = new Kategori1841720193Lintang().getByIdLintang(11);
//        
//        Buku1841720193Lintang buku1 = new Buku1841720193Lintang(novel, "Timun Mas", "Elex Media", "Bang Supit");
//        Buku1841720193Lintang buku2 = new Buku1841720193Lintang(referensi, "Metode Linier", "Springer", "Alex Baldwin");
//        Buku1841720193Lintang buku3 = new Buku1841720193Lintang(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        // Peminjaman
//        Anggota1841720193Lintang fulan = new Anggota1841720193Lintang().getByIdLintang(8);
        Anggota1841720193Lintang fulanah = new Anggota1841720193Lintang().getByIdLintang(9);
//        Buku1841720193Lintang syarhussunnah = new Buku1841720193Lintang().getByIdLintang(3);
        Buku1841720193Lintang aljabar = new Buku1841720193Lintang().getByIdLintang(6);
//        Peminjaman1841720193Lintang peminjaman1 = new Peminjaman1841720193Lintang(fulan, syarhussunnah, "2020/09/21", "2020/10/01");
        Peminjaman1841720193Lintang peminjaman2 = new Peminjaman1841720193Lintang(fulanah, aljabar, "2020/01/21", "2020/02/01");
        
        // test insert [peminjaman]
//        peminjaman1.saveLintang();
        peminjaman2.saveLintang();
        
        // test select all [peminjaman]
        for (Peminjaman1841720193Lintang p : new Peminjaman1841720193Lintang().getAllLintang()) {
            System.out.println("Nama Anggota : " + p.getAnggotaLintang().getNamaLintang()+ ", Judul Buku : " + p.getBukuLintang().getJudulLintang()+ ", " + "Tanggal Pinjam: " + p.getTanggalpinjamLintang()+ ", Tanggal Kembali: " + p.getTanggalkembaliLintang());
        }

        // test insert [kategori]
//        kat1.saveLintang();
//        kat2.saveLintang();
//        kat3.saveLintang();
  
        // test insert [anggota]
//        agt1.saveLintang();
//        agt2.saveLintang();
//        agt3.saveLintang();

        // test insert [buku]
//        buku1.saveLintang();
//        buku2.saveLintang();
        
        // test update [kategori]
//        kat2.setKeteranganLintang("Koleksi buku referensi ilmiah");
//        kat2.saveLintang();
        
        // test update [anggota]
//        agt2.setAlamatLintang("Kota Banjarmasin");
//        agt2.saveLintang();

        // test update [buku]
//        buku2.setJudulLintang("Aljabar Linier");
//        buku2.saveLintang();
        
        // test delete [kategori]
//        kat3.deleteLintang();
        
        // test delete [anggota]
//        agt1.deleteLintang();

        // test delete [buku]
//        buku3.deleteLintang();
        
        // test select all [kategori]
//        for (Kategori1841720193Lintang k : new Kategori1841720193Lintang().getAllLintang()) {
//            System.out.println("Nama: " + k.getNamaLintang()+ ", Ket: " + k.getKeteranganLintang());
//        }
        
        // test select all [anggota]
//        for (Anggota1841720193Lintang a : new Anggota1841720193Lintang().getAllLintang()) {
//            System.out.println("Nama: " + a.getNamaLintang()+ ", Alamat: " + a.getAlamatLintang()+ ", Telepon: " + a.getTeleponLintang());
//        }

        // test select all [buku]
//        for (Buku1841720193Lintang b : new Buku1841720193Lintang().getAllLintang()) {
//            System.out.println("Kategori: " + b.getKategoriLintang().getNamaLintang() + ", Judul: " + b.getJudulLintang());
//        }
        
        // test search [kategori]
//        for (Kategori1841720193Lintang k : new Kategori1841720193Lintang().searchLintang("ilmiah")) {
//            System.out.println("Nama: " + k.getNamaLintang()+ ", Ket: " + k.getKeteranganLintang());
//        }
        
        // test search [anggota]
//        for (Anggota1841720193Lintang a : new Anggota1841720193Lintang().searchLintang("Bandung")) {
//            System.out.println("Nama: " + a.getNamaLintang()+ ", Alamat: " + a.getAlamatLintang()+ ", Telepon: " + a.getTeleponLintang());
//        }

        // test search [buku]
//        for (Buku1841720193Lintang b : new Buku1841720193Lintang().searchLintang("timun")) {
//            System.out.println("Kategori: " + b.getKategoriLintang().getNamaLintang() + ", Judul: " + b.getJudulLintang());
//        }
    }
}

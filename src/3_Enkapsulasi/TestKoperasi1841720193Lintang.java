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
public class TestKoperasi1841720193Lintang 
{
    public static void main(String[] args) 
    {
        Anggota1841720193Lintang donny = new Anggota1841720193Lintang("111333444", "donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNamaLintang());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanLintang());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjamLintang(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanLintang());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjamLintang(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanLintang());
        
        System.out.println("\nMeminjam uang 200.000...");
        donny.angsurLintang(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanLintang());
        
        System.out.println("\nMeminjam uang 3.000.000...");
        donny.angsurLintang(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanLintang());
    }    
}

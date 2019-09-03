/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apelkotawisata;

/**
 *
 * @author ASUS
 */
public class ApelKotaWisataBatuMain1841720193Lintang{
    public static void main(String[] args)
    {
        // Buat dua buah objek apel
        ApelKotaWisataBatu1841720193Lintang ap11 = new ApelKotaWisataBatu1841720193Lintang();
        ApelKotaWisataBatu1841720193Lintang ap22 = new ApelKotaWisataBatu1841720193Lintang();
        ApelKotaWisataBatu1841720193Lintang ap33 = new ApelKotaWisataBatu1841720193Lintang();
    
        // Panggil method didalam objek sepeda
        ap11.setJenis("Manalagi");
        ap11.jumlahApel(6);
        ap11.tambahHargaApel(10000);
        ap11.cetakStatus();
        
        ap22.setJenis("Australi");
        ap22.jumlahApel(18);
        ap22.tambahHargaApel(12000);
        ap22.cetakStatus();
        
        ap33.setJenis("Arbeiy");
        ap33.jumlahApel(12);
        ap33.tambahHargaApel(15000);
        ap33.cetakStatus();   
    }
}
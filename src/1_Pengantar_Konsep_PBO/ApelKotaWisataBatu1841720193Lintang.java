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
public class ApelKotaWisataBatu1841720193Lintang {
    
    private String jenis;
    private int harga_apel;
    private int jumlah_apel;
    
    public void setJenis(String newValue)
    {
        jenis = newValue;
    }
    
    public void jumlahApel(int newValue)
    {
        jumlah_apel = newValue;
    }
            
    public void tambahHargaApel(int increment)
    {
        harga_apel = harga_apel + increment;
    }
    
    public void cetakStatus()
    {
        System.out.println("Jenis: "+ jenis);
        System.out.println("harga_apel: " + harga_apel);
        System.out.println("jumlah_apel:" + jumlah_apel);
    }   


}

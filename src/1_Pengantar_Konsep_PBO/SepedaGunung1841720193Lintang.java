/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SepedaGunung1841720193Lintang extends Sepeda1841720193Lintang {
    
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue)
    {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);   
    }
    
}

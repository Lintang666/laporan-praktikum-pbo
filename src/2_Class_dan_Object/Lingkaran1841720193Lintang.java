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
public class Lingkaran1841720193Lintang {
    public double PHI =3.14;
    public double mR;
    
    public double hitungLuasLintang() {
        double luas = PHI * mR * mR;
        return luas;       
    }
    
    public double hitungKelilingLintang(){
        double keliling = 2 * PHI * mR;
        return keliling;
    }
}

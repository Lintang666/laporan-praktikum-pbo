/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan3_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class MainPercobaan3Lintang {
    public static void main(String [] args){
        Pegawai1841720193Lintang masinis = new Pegawai1841720193Lintang("1234", "Spongebob Squarepants");
        Pegawai1841720193Lintang asisten = new Pegawai1841720193Lintang("4567", "Patrick Star");
        KeretaApi1841720193Lintang keretaApi = new KeretaApi1841720193Lintang("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.InfoLintang());
    }
}

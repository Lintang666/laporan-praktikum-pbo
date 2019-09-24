/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan4_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class MainPercobaan4_1841720193Lintang {
    public static void main(String[] args) {
        Penumpang1841720193Lintang p = new Penumpang1841720193Lintang("12345","Mr.Krab ");
        Gerbong1841720193Lintang gerbong = new Gerbong1841720193Lintang("A", 10);
        gerbong.setPenumpangLintang(p, 1);
        System.out.println(gerbong.infoLintang());
    }
}

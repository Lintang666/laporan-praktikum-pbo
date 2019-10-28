/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Orang1841720193Lintang {
private String mNama;
private Hewan1841720193Lintang hewanPeliharaan;

    public Orang1841720193Lintang(String mNama) {
        this.mNama = mNama;
    }


    public void peliharaHewanLintang(Hewan1841720193Lintang hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalanLintang(){
        System.out.println("Namaku "+this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakLintang();
        System.out.println("-----------------------------------------");
    }
}

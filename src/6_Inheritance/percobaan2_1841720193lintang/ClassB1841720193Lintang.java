/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class ClassB1841720193Lintang extends ClassA1841720193Lintang{
    private int mZ;
    
    public void setZLintang(int mZ) {
        this.mZ = mZ;
    }
    
    public void getNilaiZLintang() {
        System.out.println("Nilai mZ : " + mZ);
    }
    
    public void getJumlahLintang() {
        System.out.println("Jumlah : " + (getXLintang() + getYLintang() + mZ));
    }
}

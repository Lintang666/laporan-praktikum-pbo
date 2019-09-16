/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Motor1841720193Lintang {
    private int mKecepatan = 0;
    public boolean kontakOn = false;
    public void nyalakanMesinLintang(){
        kontakOn = true;
    }
    public void matikanMesinLintang(){
        kontakOn = false;
        mKecepatan = 0;
    }
    public void tambahKecepatanLintang(){
        if (kontakOn == true ){
            if (mKecepatan < 100 ){
            mKecepatan += 5;
            }
            else{
                System.out.println("Kecapatan Maksimal");                
            }    
            
        }
        else{
            System.out.println("Kecepatan tidak bisa betambah karena Mesin Off!\n");
        }
    }
    public void kurangiKecepatanLintang(){
        if (kontakOn == true){
            mKecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!\n");
        }
    }
    public void printStatusLintang(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mKecepatan+"\n");
    }
}

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
public class MotorDemo1841720193Lintang {
    public static void main(String[] args){
        Motor1841720193Lintang motor = new Motor1841720193Lintang();
        motor.printStatusLintang();
        motor.tambahKecepatanLintang();
        
        motor.nyalakanMesinLintang();
        motor.printStatusLintang();
        
        motor.tambahKecepatanLintang();
        motor.printStatusLintang();
        
        motor.tambahKecepatanLintang();
        motor.printStatusLintang();
        
        motor.tambahKecepatanLintang();
        motor.printStatusLintang();
        
        motor.matikanMesinLintang();
        motor.printStatusLintang();
    }
}
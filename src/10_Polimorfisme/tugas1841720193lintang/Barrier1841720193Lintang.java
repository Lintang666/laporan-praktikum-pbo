/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Barrier1841720193Lintang implements Destroyable1841720193Lintang {
    private int strength;
    
    public Barrier1841720193Lintang(int strength){
        this.strength = strength;
    }
    public void setStrengthLintang (int strength){
        this.strength = strength;
    }
    public int getStrengthLintang (){
        return strength;
    } 
    public void destroyLintang(){
        strength -= strength*0.1;
    }  
    public void destroyedLintang(){
        destroyLintang();
    }
    public String getBarrierInfoLintang(){
        return "Barrier Strength = "+strength+"\n";
    }
}

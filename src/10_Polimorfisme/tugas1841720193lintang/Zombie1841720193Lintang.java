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
public abstract class Zombie1841720193Lintang implements Destroyable1841720193Lintang { 
    protected int health;    
    protected int level;     
    
    public String getZombieInfoLintang(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void healLintang();    
    @Override    
    public abstract void destroyedLintang(); 
} 
   

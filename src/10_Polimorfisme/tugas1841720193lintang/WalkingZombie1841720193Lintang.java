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
public class WalkingZombie1841720193Lintang extends Zombie1841720193Lintang {
    public WalkingZombie1841720193Lintang(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void healLintang(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    public void destroyedLintang(){
        health -= health*0.19;
    }
    public String getZombieInfoLintang(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfoLintang()+"\n";
        return info;
    }
}

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
public class TeaserTugas1841720193Lintang {
    public static void main(String[] args) {
        WalkingZombie1841720193Lintang wz = new WalkingZombie1841720193Lintang(100,1);
        JumpingZombie1841720193Lintang jz = new JumpingZombie1841720193Lintang(100,2);
        Barrier1841720193Lintang b = new Barrier1841720193Lintang (100);
        Plant1841720193Lintang p = new Plant1841720193Lintang();
        System.out.println(""+wz.getZombieInfoLintang());
        System.out.println(""+jz.getZombieInfoLintang());
        System.out.println(""+b.getBarrierInfoLintang());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroyLintang(wz);
            p.doDestroyLintang(jz);
            p.doDestroyLintang(b);
        }
        System.out.println(""+wz.getZombieInfoLintang());
        System.out.println(""+jz.getZombieInfoLintang());
        System.out.println(""+b.getBarrierInfoLintang());
    } 
}

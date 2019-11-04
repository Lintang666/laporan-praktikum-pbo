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
public class Plant1841720193Lintang {
    public void doDestroyLintang (Destroyable1841720193Lintang d){
        if (d instanceof WalkingZombie1841720193Lintang){
            WalkingZombie1841720193Lintang wz = (WalkingZombie1841720193Lintang) d;
            wz.destroyedLintang();
        }else if (d instanceof JumpingZombie1841720193Lintang){
            JumpingZombie1841720193Lintang jz = (JumpingZombie1841720193Lintang) d;
            jz.destroyedLintang();
        }else if (d instanceof Barrier1841720193Lintang){
            Barrier1841720193Lintang b = (Barrier1841720193Lintang) d;
            b.destroyedLintang();
        }
    }
}

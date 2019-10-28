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
public abstract class Hewan1841720193Lintang {
    private int mUmur;
    
    protected Hewan1841720193Lintang(){
        this.mUmur = 0;
    }
    
    public void bertambahUmurLintang(){
        this.mUmur += 1;
    }
    
    public abstract void bergerakLintang();
}

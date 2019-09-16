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
public class EncapDemo1841720193Lintang {
    private String mName;
    private int mAge;
    
    public String getNameLintang()
    {
        return mName;
    }
    
    public void setNameLintang(String newName)
    {
        mName = newName;
    }
    
    public int getAgeLintang()
    {
        return mAge;
    }
    
    public void setAgeLintang(int newAge)
    {
        if(newAge >= 18 && newAge <=30)
        {
            mAge = newAge;
        }else {
            System.out.println("Age hanya bisa diberi nilai Maksimal 30 dan Minimal 18");
        }
    }
}


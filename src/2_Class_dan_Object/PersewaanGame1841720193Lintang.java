package tugas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PersewaanGame1841720193Lintang {
    private String mId ;
    private String mNamaMember;
    private String mNamaGame;
    private int mHargaBayar;
    
    public void setIDLintang(String ID) {
        mId = ID;
    }
    
    public void setNamaMBLintang(String nameMB) {
        mNamaMember = nameMB;
    }
    
    public void setNameGMLintang(String nameGM) {
        mNamaGame = nameGM;
    }
    
    public int setHargaBayarLintang(int lamaSewa , int harga) {
        mHargaBayar = lamaSewa + harga;
        return mHargaBayar;
    }
    
    public void tampilDataLintang() {
        System.out.println("ID  : "+ mId);
        System.out.println("Nama Member : " + mNamaMember);
        System.out.println("Nama Game : " + mNamaGame);
        System.out.println("Harga yang harus dibayar adalah : Rp. " + setHargaBayarLintang(2, 10000));
    }
}
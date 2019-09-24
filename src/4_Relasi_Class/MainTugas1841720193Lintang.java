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
public class MainTugas1841720193Lintang {
    public static void main(String[] args) { 
        Mahasiswa1841720193Lintang m = new Mahasiswa1841720193Lintang(1841720193, "Lintang Kusuma Adjie", "TI - 2D", "D-IV Teknik Informatika"); 
        Dosen1841720193Lintang d = new Dosen1841720193Lintang("PBO - 001" , "Habibie Ed Dien"); 
        Matkul1841720193Lintang mk = new Matkul1841720193Lintang("PBO",d, 3);
        Nilai1841720193Lintang n = new Nilai1841720193Lintang(m , d, mk, 90); 
        System.out.println(n.infoLintang()); 
    } 
} 

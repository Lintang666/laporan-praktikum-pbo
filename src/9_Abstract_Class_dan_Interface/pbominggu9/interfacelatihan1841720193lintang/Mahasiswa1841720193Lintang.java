/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.interfacelatihan1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Mahasiswa1841720193Lintang implements ICumlaude1841720193Lintang {
    protected String nama;

    public Mahasiswa1841720193Lintang(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusLintang() {
        System.out.println("BISMILLAH TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiLintang() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    public void kuliahDikampusLintang(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }    
}

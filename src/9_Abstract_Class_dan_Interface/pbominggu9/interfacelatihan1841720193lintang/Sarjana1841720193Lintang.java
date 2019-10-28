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
public class Sarjana1841720193Lintang extends Mahasiswa1841720193Lintang implements ICumlaude1841720193Lintang{

    public Sarjana1841720193Lintang(String nama) {
        super(nama);
    }

    
    @Override
    public void lulusLintang() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiLintang() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }
}

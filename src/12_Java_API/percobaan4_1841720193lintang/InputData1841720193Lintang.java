/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintang.percobaan4_1841720193lintang;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class InputData1841720193Lintang {
    ArrayList<Mahasiswa1841720193Lintang > ListMahasiswa;

    public InputData1841720193Lintang() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataLintang(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720193Lintang  mhs = new Mahasiswa1841720193Lintang (Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720193Lintang> getData() {
        return ListMahasiswa;
    }
}

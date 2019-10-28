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
public class Program1841720193Lintang{ 
    public static void main(String[] args){
        Rektor1841720193Lintang pakRektor = new Rektor1841720193Lintang();
        
        Mahasiswa1841720193Lintang MahasiswaBiasa = new Mahasiswa1841720193Lintang("Charlie");
        Sarjana1841720193Lintang sarjanaCumlaude = new Sarjana1841720193Lintang("Dini");
        PascaSarjana1841720193Lintang masterCumlaude = new PascaSarjana1841720193Lintang("Elok");
        
//        MahasiswaBiasa.kuliahDikampusLintang();
        pakRektor.beriSertifikatCumlaudeLintang(masterCumlaude);
      //  sarjanaCumlaude.kuliahDikampusLintang();
        pakRektor.beriSertifikatCumlaudeLintang(MahasiswaBiasa);
    //    masterCumlaude.kuliahDikampusLintang();
        pakRektor.beriSertifikatCumlaudeLintang(sarjanaCumlaude);
    }
}

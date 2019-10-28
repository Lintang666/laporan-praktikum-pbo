/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.interfaceimplementation1841720193lintang;

/**
 *
 * @author ASUS
 */
public class P3_Program1841720193Lintang {
    public static void main(String[] args){
        P3_Rektor1841720193Lintang pakRektor = new P3_Rektor1841720193Lintang();
        
        //P3_Mahasiswa1841720193Lintang MahasiswaBiasa = new P3_Mahasiswa1841720193Lintang("Charlie");
        P3_Sarjana1841720193Lintang sarjanaCumlaude = new P3_Sarjana1841720193Lintang("Dini");
        P3_PascaSarjana1841720193Lintang masterCumlaude = new P3_PascaSarjana1841720193Lintang("Elok");
        
        //MahasiswaBiasa.kuliahDikampusLintang();
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        //sarjanaCumlaude.kuliahDikampusLintang();
        //pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        //masterCumlaude.kuliahDikampusLintang();
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        
        pakRektor.beriSertifikatMawapresLintang(masterCumlaude);
        pakRektor.beriSertifikatMawapresLintang(sarjanaCumlaude);
    }
}
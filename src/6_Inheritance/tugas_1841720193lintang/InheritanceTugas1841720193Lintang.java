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
public class InheritanceTugas1841720193Lintang {
    public static void main(String[] args) {
        Komputer1841720193Lintang k = new Komputer1841720193Lintang("Nexstgo", (int)2.60, 8, "Intel Core I7");
        Leptop1841720193Lintang l = new Leptop1841720193Lintang("MSI", (int)2.80, 8, "Intel Core 7+", "Baterai Tanam");
        Pc1841720193Lintang pc = new Pc1841720193Lintang("ROG", (int)2.60, 4, "AMD Raizen", 1280);
        System.out.println("===============PC===============");
        pc.tampilPcLintang();
        Mac1841720193Lintang mac = new Mac1841720193Lintang("MSI", (int)2.80, 8, "Intel Core 7+", "Baterai Tanam", "FireWall");
        System.out.println("===============MAC===============");
        mac.tampilMacLintang();
        Windows1841720193Lintang windows = new Windows1841720193Lintang("ROG", (int)2.80, 8, "Intel Core 7", "Baterai Tanam", "Win10");
        System.out.println("===============WINDOWS===============");
        windows.tampilWindowsLintang();
    }
}

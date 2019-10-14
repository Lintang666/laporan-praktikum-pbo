/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1_1841720193lintang;

/**
 *
 * @author ASUS
 */
public class Utama1841720193Lintang {
public static void main(String[] args)
{
System.out.println("Program Testing Class Manager & Staff");
Manager1841720193Lintang man[]=new Manager1841720193Lintang[2];
Staff1841720193Lintang staff1[]=new Staff1841720193Lintang[2];
Staff1841720193Lintang staff2[]=new Staff1841720193Lintang[3];

//pembuatan manager

man[0]=new Manager1841720193Lintang();
man[0].setmNamaLintang("Tedjo");
man[0].setmNipLintang("101");
man[0].setmGolonganLintang("1");
man[0].setmTunjanganLintang(50000000);
man[0].setmBagianLintang("Administrasi");

man[1]=new Manager1841720193Lintang();
man[1].setmNamaLintang("Atika");
man[1].setmNipLintang("102");
man[1].setmGolonganLintang("1");
man[1].setmTunjanganLintang(2500000);
man[1].setmBagianLintang("Pemasaran");

staff1[0]=new Staff1841720193Lintang();
staff1[0].setmNamaLintang("Usman");
staff1[0].setmNipLintang("0003");
staff1[0].setmGolonganLintang("2");
staff1[0].setmLemburLintang(10);
staff1[0].setmGajiLemburLintang(10000);
        
System.out.println();
staff1[1] = new Staff1841720193Lintang();
staff1[1].setmNamaLintang("Anugrah");
staff1[1].setmNipLintang("0005");
staff1[1].setmGolonganLintang("2");
staff1[1].setmLemburLintang(10);
staff1[1].setmGajiLemburLintang(55000);
man[0].setStaffLintang(staff1);
        
System.out.println();
staff2[0] = new Staff1841720193Lintang();
staff2[0].setmNamaLintang("Hendra");
staff2[0].setmNipLintang("0004");
staff2[0].setmGolonganLintang("3");
staff2[0].setmLemburLintang(15);
staff2[0].setmGajiLemburLintang(5500);
        
System.out.println();
staff2[1] = new Staff1841720193Lintang();
staff2[1].setmNamaLintang("Arie");
staff2[1].setmNipLintang("0006");
staff2[1].setmGolonganLintang("4");
staff2[1].setmLemburLintang(5);
staff2[1].setmGajiLemburLintang(100000);
        
System.out.println();
staff2[2] = new Staff1841720193Lintang();
staff2[2].setmNamaLintang("Mentari");
staff2[2].setmNipLintang("0007");
staff2[2].setmGolonganLintang("3");
staff2[2].setmLemburLintang(6);
staff2[2].setmGajiLemburLintang(20000);
man[1].setStaffLintang(staff2);
        
System.out.println();
man[0].lihatInfoLintang();
man[1].lihatInfoLintang();
}
}

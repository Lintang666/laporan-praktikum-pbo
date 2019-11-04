/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumenpolimorfismeinstanceodcastingobjek1841720193lintang;
/**
 *
 * @author ASUS
 */
public class Tester4_1841720193Lintang {
    public static void main(String[] args) {
        Owner1841720193Lintang ow = new Owner1841720193Lintang();
        ElectricityBill1841720193Lintang eBill = new ElectricityBill1841720193Lintang(5, "R-1");
        ow.payLintang(eBill); // Pay for electricity bill
        System.out.println("-------------------------------");
        
        PermanentEmployee1841720193Lintang pEmp = new PermanentEmployee1841720193Lintang("Dedik", 500);
        ow.payLintang(pEmp); // Pay for permanent employee
        System.out.println("-------------------------------");
        
        InternshipEmployee1841720193Lintang iEmp = new InternshipEmployee1841720193Lintang("Sunarto", 5);
        ow.showMyEmployeeLintang(pEmp); // show permanent employee info
        System.out.println("-------------------------------");
        ow.showMyEmployeeLintang(iEmp); // show internship employee info
    }
}

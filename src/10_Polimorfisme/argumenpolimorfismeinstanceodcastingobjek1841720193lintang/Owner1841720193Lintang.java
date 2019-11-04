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
public class Owner1841720193Lintang {
    public void payLintang(Payable1841720193Lintang p) {
        System.out.println("Total payment = " + p.getPaymentAmountLintang());
        if(p instanceof ElectricityBill1841720193Lintang) {
            ElectricityBill1841720193Lintang eb = (ElectricityBill1841720193Lintang) p;
            System.out.println("" + eb.getBillInfoLintang());
        }else if(p instanceof PermanentEmployee1841720193Lintang) {
            PermanentEmployee1841720193Lintang pe = (PermanentEmployee1841720193Lintang) p;
            pe.getEmployeeInfoLintang();
            System.out.println("" + pe.getEmployeeInfoLintang());
        }
    }
    
    public void showMyEmployeeLintang(Employee1841720193Lintang e) {
        System.out.println("" + e.getEmployeeInfoLintang());
        if(e instanceof PermanentEmployee1841720193Lintang) {
            System.out.println("You have to pay her / him monthly!!!");
        }else {
            System.out.println("No need to pay him/her");
        }
    }
}

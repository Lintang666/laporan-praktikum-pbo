/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heterogenouscollection1841720193lintang;
/**
 *
 * @author ASUS
 */
public class Tester3_1841720193Lintang {
    public static void main(String[] args) {
        PermanentEmployee1841720193Lintang pEmp = new PermanentEmployee1841720193Lintang("Dedik", 500);
        InternshipEmployee1841720193Lintang iEmp = new InternshipEmployee1841720193Lintang("Sunarto", 5);
        ElectricityBill1841720193Lintang eBill = new ElectricityBill1841720193Lintang(5, "A-1");
        Employee1841720193Lintang e[] = {pEmp, iEmp};
        Payable1841720193Lintang p[] = {pEmp, eBill};
        Employee1841720193Lintang e2[] = {pEmp, iEmp,};
    }
}
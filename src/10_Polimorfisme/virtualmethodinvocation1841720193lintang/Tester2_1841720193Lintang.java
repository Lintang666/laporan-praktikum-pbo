/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualmethodinvocation1841720193lintang;
/**
 *
 * @author ASUS
 */
public class Tester2_1841720193Lintang {
    public static void main(String[] args) {
        PermanentEmployee1841720193Lintang pEmp = new PermanentEmployee1841720193Lintang("Dedik", 500);
        Employee1841720193Lintang e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfoLintang());
        System.out.println("----------------------");
        System.out.println("" + pEmp.getEmployeeInfoLintang());
    }
}

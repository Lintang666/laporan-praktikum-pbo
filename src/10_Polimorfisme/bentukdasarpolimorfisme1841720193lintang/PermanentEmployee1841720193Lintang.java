/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bentukdasarpolimorfisme1841720193lintang;

/**
 *
 * @author ASUS
 */
public class PermanentEmployee1841720193Lintang extends Employee1841720193Lintang implements Payable1841720193Lintang{
    private int mSalary;

    public PermanentEmployee1841720193Lintang(String name, int mSalary) {
        this.name = name;
        this.mSalary = mSalary;
    }
     public int getSalaryLintang() {
        return mSalary;
    }

    public void setSalaryLintang(int mSalary) {
        this.mSalary = mSalary;
    }
    
    @Override
    public int getPaymentAmountLintang() {
        return (int) (mSalary + 0.05 * mSalary);
    }
    
    @Override
    public String getEmployeeInfoLintang() {
        String info = super.getEmployeeInfoLintang() + "\n";
        info += "Registered as permanent employee with salary " + mSalary + "\n";
        return info;
    }
    
}

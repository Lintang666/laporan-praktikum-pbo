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
public class InternshipEmployee1841720193Lintang extends Employee1841720193Lintang {
    private int mLength;

    public InternshipEmployee1841720193Lintang(String name, int mLength) {
        this.mLength = mLength;
        this.name = name;
    }
    public int getmLengthLintang() {
        return mLength;
    }

    public void setmLengthLintang(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoLintang() {
        String info = super.getEmployeeInfoLintang()+"\n";
        info += "Registred as intership employee for "+mLength+" month/s\n";
        return info; //To change body of generated methods, choose Tools | Templates.
    }    
}

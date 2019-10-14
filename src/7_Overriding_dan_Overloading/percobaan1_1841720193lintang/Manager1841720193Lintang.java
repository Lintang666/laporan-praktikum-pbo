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
public class Manager1841720193Lintang extends Karyawan1841720193Lintang {
    private double mTunjangan;
    private String mBagian;
    private Staff1841720193Lintang st[];

    public void setmTunjanganLintang(double tunjangan)
    {
        this.mTunjangan=tunjangan;
    }
    public double getmTunjanganLintang()
    {
        return mTunjangan;
    }
    public void setmBagianLintang(String bagian)
    {
        this.mBagian=bagian;
    }
    public String getmBagianLintang()
    {
        return mBagian;
    }
    public void setStaffLintang(Staff1841720193Lintang[] st)
    {
        this.st=st;
    }
    public void viewStaffLintang()
    {
        int i;
        System.out.println("------------------");
        for(i=0;i<st.length;i++)
        {
            st[i].lihatInfoLintang();
        }
        System.out.println("------------------");
    }
    public void lihatInfoLintang()
    {
        System.out.println("Manager :"+this.getmBagianLintang());
        System.out.println("NIP :"+this.getmNipLintang());
        System.out.println("Nama :"+this.getmNamaLintang());
        System.out.println("Golongan :"+this.getmGolonganLintang());
        System.out.printf("Tunjangan :%.0f\n",this.getmTunjanganLintang());
        System.out.printf("Gaji :%.0f\n",this.getmGajiLintang());
        System.out.println("Bagian :"+this.getmBagianLintang());
        this.viewStaffLintang();
    }
    public double getmGajiLintang()
    {
        return super.getmGajiLintang()+mTunjangan;
    }
}

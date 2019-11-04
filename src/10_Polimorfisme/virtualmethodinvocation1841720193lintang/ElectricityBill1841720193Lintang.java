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
public class ElectricityBill1841720193Lintang implements Payable1841720193Lintang {
    private int mKwh;
    private String mCategory;
    
    public ElectricityBill1841720193Lintang(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getKwhLintang() {
        return mKwh;
    }

    public void setKwhLintang(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getCategoryLintang() {
        return mCategory;
    }

    public void setCategoryLintang(String mCategory) {
        this.mCategory = mCategory;
    }
    
    @Override
    public int getPaymentAmountLintang() {
        return mKwh * getBasePriceLintang();
    }
    
    public int getBasePriceLintang() {
        int bPrice = 0;
        switch(mCategory) {
            case "R-1" : 
                bPrice = 100;
                break;
            case "R-2" :
                bPrice = 200;
                break;
        }
        return bPrice;
    }
    
    public String getBillInfoLintang() {
        return "kWH = " + mKwh + "\n" + "Category = " + mCategory + " ( " + getBasePriceLintang() + " per kWH )\n";
    }
}

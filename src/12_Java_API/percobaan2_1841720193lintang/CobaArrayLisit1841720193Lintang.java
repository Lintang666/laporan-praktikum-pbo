/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintang.percobaan2_1841720193lintang;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class CobaArrayLisit1841720193Lintang {
    public static void main(String[] args){
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println(mListCountry);
        System.out.format("List index 0 = %s\n", mListCountry.get(0));
        System.out.format("List index 2 = %s\n", mListCountry.get(2));
    }
}

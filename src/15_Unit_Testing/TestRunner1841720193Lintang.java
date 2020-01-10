package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Kategori1841720193LintangTest;
import unittest.database.Anggota1841720193LintangTest;

/**
 *
 * @author Lintang Kusuma Adjie
 * 
 */
public class TestRunner1841720193Lintang {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720193Lintang.class);
        showMessageResultLintang(mResult, MessageProcessorTest1841720193Lintang.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Kategori1841720193LintangTest.class);
        showMessageResultLintang(mResult, Kategori1841720193LintangTest.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Anggota1841720193LintangTest.class);
        showMessageResultLintang(mResult, Anggota1841720193LintangTest.class.getSimpleName());
    }

    private static void showMessageResultLintang(Result mResult, String mClassName) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", mClassName, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}

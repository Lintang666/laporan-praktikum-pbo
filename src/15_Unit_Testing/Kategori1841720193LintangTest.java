package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Lintang Kusuma Adjie
 */
public class Kategori1841720193LintangTest extends TestCase {

    Kategori1841720193Lintang instance;

    public Kategori1841720193LintangTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720193Lintang("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchLintang method, of class Kategori1841720193Lintang.
     */
    @Test
    public void testSearchLintang() {
        System.out.println("save test");
        this.instance.saveLintang();
        ArrayList<Kategori1841720193Lintang> expResult = instance.getByNamaAndKeteranganLintang(instance.getNamaLintang(), instance.getKeteranganLintang());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveLintang method, of class Kategori1841720193Lintang.
     */
    @Test
    public void testSaveLintang() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720193Lintang> result = instance.searchLintang(keyword);
        ArrayList<Kategori1841720193Lintang> expResult = instance.getByNamaAndKeteranganLintang(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}

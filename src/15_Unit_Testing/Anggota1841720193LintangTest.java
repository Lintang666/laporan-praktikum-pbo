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
public class Anggota1841720193LintangTest extends TestCase {

    Anggota1841720193Lintang instance;

    public Anggota1841720193LintangTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720193Lintang("Lintang", "Jl. Abdillah", "085877990684");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchLintang method, of class Anggota1841720193Lintang.
     */
    @Test
    public void testSearchLintang() {
        System.out.println("save test");
        this.instance.saveLintang();
        ArrayList<Anggota1841720193Lintang> expResult = instance.getByNamaAndAlamatAndTeleponLintang(instance.getNamaLintang(), instance.getAlamatLintang(), instance.getTeleponLintang());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveLintang method, of class Anggota1841720193Lintang.
     */
    @Test
    public void testSaveLintang() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720193Lintang> result = instance.searchLintang(keyword);
        ArrayList<Anggota1841720193Lintang> expResult = instance.getByNamaAndAlamatAndTeleponLintang(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}

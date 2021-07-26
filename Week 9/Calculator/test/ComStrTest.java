

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ComStrTest {
    
    //1.create variables
    String a, b, expResult;
    
    
    //2.create "parameter constructor" of class to be tested
    public ComStrTest(String a, String b, String expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }
    
    
    //3.create method to pass parameter list
    @Parameters
    public static Collection<String[]>getParameters()
    {
        String [][] arr;
        arr = new String[][]{{"1","0","10"},{"hi","bye","hibye"},{"10","number","10number"},{"age","29","age29"}};
        return Arrays.asList(arr);
    }
    
    
    //4.create "test case"
    @Test
    public void testCombine()
    {
        
        ComStr obj = new ComStr();
        String Result = obj.combine(a, b);
        assertEquals(expResult, Result);
    }
    
    /*
    public ComStrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of combine method, of class ComStr.
     */
    /*
    @Test
    public void testCombine() {
        System.out.println("combine");
        String a = "";
        String b = "";
        ComStr instance = new ComStr();
        String expResult = "";
        String result = instance.combine(a, b);
        assertEquals(expResult, result);
        
    }*/

    
}

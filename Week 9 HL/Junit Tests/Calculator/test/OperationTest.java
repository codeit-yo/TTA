/*
Note: word start with "@" called it as "Annotation"

Annotation: information to java compiler
*/
//@After @AfterClass @Before @BeforeClass
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//for parameterized test case
import org.junit.runner.RunWith;//+
import org.junit.runners.Parameterized;//+
import org.junit.runners.Parameterized.Parameters;//+
//for parameter list
import java.util.Collection;//+
import java.util.Arrays;//+


@RunWith(Parameterized.class)//+
public class OperationTest {
    
//1.create variables
    int a;
    int b;
    int actualResult;
//2.create "parameter constructor" of class to be tested
    public OperationTest(int a, int b, int actualResult) 
    {
        this.a = a;
        this.b = b;
        this.actualResult = actualResult;
    }
//3.create method to pass parameter list
    /*
    Note: use annotation as "Parameter"
    Return type = "Collection" interface
    retrun value = "Arrays" [group of elements]
    eg. {a,b,actualResult}
    { {2,2,4},{1,2,3},{-1,-1,-2},{4,0,4} } => 2D array
    method name = getParameters()
    */
    
    @Parameters
    public static Collection<Integer[]> getParameters()
    {
        Integer[][] arr;//2D array
        arr = new Integer[][]{{2,2,4} , {1,2,3} , {-1,-1,-2} , {4,0,4}};
        return Arrays.asList(arr);
    }
    
//4.create "test case"
    @Test
    public void addPTest()
    {
        System.out.println("Test Case");
        Operation obj = new Operation();
        int Result = obj.add(a, b);
        assertEquals(actualResult, Result);
    }
    
    /*
    public OperationTest() {
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
    }*/

    /*
    To write "test case" use annotation "@Test"
    */
    /*
    @Test
    public void addTest()
    {
        //1. create object of class to be tested
        Operation obj = new Operation();
        //2. call method to be tested using object
        int actualResult = obj.add(1, 2);
        //3. compare actualResult with expectedResult
        int expectedResult = 3;
        //3.a write "assert" statement will check result
        assertEquals(expectedResult , actualResult);//3, 3=> 3-3 == 0 pass 1== nonZero fail
        
    }
    
    @Test
    public void addTest2()
    {
        //1. create object of class to be tested
        Operation obj = new Operation();
        //2. call method to be tested using object
        int actualResult = obj.add(2, 2);
        //3. compare actualResult with expectedResult
        int expectedResult = 4;
        //3.a write "assert" statement will check result
        assertEquals(expectedResult , actualResult);
    }
    
    @Test
    public void addTest3()
    {
        //1. create object of class to be tested
        Operation obj = new Operation();
        //2. call method to be tested using object
        int actualResult = obj.add(-1, -1);
        //3. compare actualResult with expectedResult
        int expectedResult = -2;
        //3.a write "assert" statement will check result
        assertEquals(expectedResult , actualResult);
    }
    
    @Test
    public void addTest4()
    {
        //1. create object of class to be tested
        Operation obj = new Operation();
        //2. call method to be tested using object
        int actualResult = obj.add(4, 0);
        //3. compare actualResult with expectedResult
        int expectedResult = 4;
        //3.a write "assert" statement will check result
        assertEquals(expectedResult , actualResult);
    }*/
    
    //Correct way of testing Parameter
    
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("Test Started");
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        System.out.println("Test Stoped");
    }
    
    @Before
    public void setUpCase()
    {
        System.out.println("Test Case Setup");
    }
    
    @After
    public void tearDownCase()
    {
        System.out.println("Test Case Tear");
    }

    
}

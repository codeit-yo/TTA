


import org.junit.Test;
import static org.junit.Assert.*;


public class CircleTest {
    
    

    
    
    @Test
    public void testDraw()
    {
        Circle obj = new Circle(2);
        double result = obj.draw();
        double expResult = 12.56;
        assertEquals(expResult, result,2);
    }
    
    @Test
    public void testDraw2()
    {
        Circle obj = new Circle(4.0);
        double result = obj.draw();
        double expResult = 50.56;
        assertEquals(expResult, result,4.0);
    }
    
    @Test
    public void testDraw3()
    {
        Circle obj = new Circle(-2);
        double result = obj.draw();
        String expResult = "wrong radius";
        assertEquals(expResult, result);
    }

    
}

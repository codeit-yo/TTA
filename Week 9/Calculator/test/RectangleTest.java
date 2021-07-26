

import org.junit.Test;
import static org.junit.Assert.*;


public class RectangleTest {
    

    /**
     * Test of draw method, of class Rectangle.
     */
    
    @Test
    public void testDraw() {
        Rectangle obj = new Rectangle(2,4);
        double expResult = 8;
        double result = obj.draw();
        assertEquals(expResult, result,0.0);
    }
    
    @Test
    public void testDraw2() {
        Rectangle obj = new Rectangle(1.0,4.0);
        double expResult = 4;
        double result = obj.draw();
        assertEquals(expResult, result,0.0);
    }
    
    @Test
    public void testDraw3() {
        Rectangle obj = new Rectangle(-1,5);
        String expResult = "Wrong width";
        double result = obj.draw();
        assertEquals(expResult, result);
    }

    
}

//method demo
public class Demo3 {
    
    //Q  Create Method for addition(+)
    
    public void m1()
    {
        int a = 10;
        int b = 2;
        int c = a + b;
        System.out.println("Result = " +c);
    }
    
    
    //2. Return_type - no parameter
    public int m2()
    {
        int a = 12;
        int b = 56;
        int c = a + b;
        
        return c;
    }
    
    //3. parameter
    public void m3(int a , int b)
    {
        int c = a + b;
        System.out.println("Result of m3() = "+c);
    }
    
    //Main method
    
    public static void main(String[] args) {
        
        
        //create object: ClassName objname = new ClassName(); -> constructor
        Demo3 obj1 = new Demo3();
        //method call using object-> .(dot) operater
        obj1.m1();
        
        int result = obj1.m2();
        System.out.println("Result of m2() = "+result);//2. Return_type - no parameter
        
        
        obj1.m3(20, 50); //3. with parameter
    }
            
}

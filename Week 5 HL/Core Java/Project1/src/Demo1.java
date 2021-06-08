
public class Demo1 {
    //variable
    int a = 10; //4 byte -> class/global variable
    double b = 10.0;//8 byte
    char c = 'w'; //1 byte
    String d = "w";
    String e = "abc";
    boolean f = true; //1 bit
    boolean g = false; //1 bit
    
    //to run program main() method
    //static no need for object
    public static void main(String[] args) {
        int a = 10;//local variable
        
        //display output on console
        System.out.println("Hi Yolanda!");
        System.out.println("Hi Yolanda");
        
        //Q print 1-N(N accept from user)
        int N = 15;
        int i = 1;
        while(i<=N)
        {
            System.out.println(i);
            i++;
        }//while ends
        
        //print variables
        System.out.println("a = "+a);
    }//main ends
    
}//class ends

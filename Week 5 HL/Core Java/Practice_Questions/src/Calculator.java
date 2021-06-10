import java.util.Scanner;

public class Calculator {
    
       //1. Addition
    public double add(double a , double b)
    {
        return a+b;
    }//add ends
    
    //2. Subtraction
    public double sub(double a , double b)
    {
        return a-b;
    }//sub ends
    
    //3. Multiply
    public double mult(double a , double b)
    {
        return a*b;
    }//mult ends
    
    //4. Division
    public double div(double a , double b)
    {
        return a/b;
    }//div ends
    
    //5. Remainder
    public double rem(double a , double b)
    {
        return a%b;
    }//rem ends
    
    
    public static void main(String[]args) {
        Scanner Lucky = new Scanner(System.in);
        double fnum,snum,answer;
        
        
        System.out.println("Enter First Number: ");
        fnum = Lucky.nextDouble();
        System.out.println("+");
        System.out.println("Enter Second Number: ");
        snum = Lucky.nextDouble();
        System.out.println("=");
        answer = fnum + snum;
        System.out.println(answer);
    
        Calculator obj = new Calculator();
        System.out.println("Enter your choice");
        String choice = Lucky.next();
        
        switch(choice)
        {
            case "+":
                System.out.println("Enter your first number");
                fnum = Lucky.nextDouble();
                System.out.println("Enter your second number");
                fnum = Lucky.nextDouble();
                System.out.println("Result =" +obj.add(fnum, snum));
        }
        
    }//main end
    
  }//class end
    

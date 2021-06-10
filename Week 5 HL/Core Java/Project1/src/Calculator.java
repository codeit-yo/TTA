import java.util.Scanner;

// + - / * %
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
    
        
    //main method
    public static void main(String[] args) {
        
        double num1 , num2;
        int answer;
        
        Calculator obj = new Calculator(); //object
        //Scanner -> user input
        
        Scanner sc = new Scanner(System.in);
        
      do{
        
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        
        System.out.println("Enter your choice");
        //int choice = sc.nextInt();
        String choice = sc.next(); // "+" "*" "/"
        
        switch(choice)
        {
            case "+":
                System.out.println("Enter num1=");
                num1 = sc.nextDouble();
                System.out.println("Enter num2=");
                num2 = sc.nextDouble();
                System.out.println("Result ="+(obj.add(num1, num2)));
                break;
                
            case "-":
                System.out.println("Enter num1=");
                num1 = sc.nextDouble();
                System.out.println("Enter num2=");
                num2 = sc.nextDouble();
                System.out.println("Result ="+(obj.sub(num1, num2)));
                break;
                
                
            case "*":
                System.out.println("Enter num1=");
                num1 = sc.nextDouble();
                System.out.println("Enter num2=");
                num2 = sc.nextDouble();
                System.out.println("Result ="+(obj.mult(num1, num2)));
                break;
                
                
            case "/":
                System.out.println("Enter num1=");
                num1 = sc.nextDouble();
                System.out.println("Enter num2=");
                num2 = sc.nextDouble();
                System.out.println("Result ="+(obj.div(num1, num2)));
                break;
                
            case "%":
                System.out.println("Enter num1=");
                num1 = sc.nextDouble();
                System.out.println("Enter num2=");
                num2 = sc.nextDouble();
                System.out.println("Result ="+(obj.rem(num1, num2)));
                break;
                 
            default: 
                System.out.println("Please enter a valid choice");
        }//switch ends
        
            System.out.println("Do you want to continue? 1(Yes) / 0(No):");
            answer = sc.nextInt();
        
      }while(answer == 1);
        
        
    }//main ends
    
}//class ends

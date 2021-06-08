import java.util.Scanner;

public class Calculator {
    
    public static void main(String[]args) {
        Scanner Lucky = new Scanner(System.in);
        double fnum;
        double snum;
        double answer;
        
        System.out.println("Enter First Number: ");
        fnum = Lucky.nextDouble();
        System.out.println("+");
        System.out.println("Enter Second Number: ");
        snum = Lucky.nextDouble();
        System.out.println("=");
        answer = fnum + snum;
        System.out.println(answer);
        
             
    }
    
}

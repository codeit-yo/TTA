//giving input from user

import java.util.Scanner;//scan input

public class demo2 {
    public static void main(String[]args) {
        
        
       Scanner sc = new Scanner(System.in);//get value from console-> String
        System.out.println("Enter Your Name");
       String s1 = sc.next();//String
        System.out.println("Your name = "+s1);
        System.out.println("---------------------");
     
        
        //Q print 1-N (accept from user)
        System.out.println("Enter Favourite Number");
        int N = sc.nextInt();
        int i=1;
        while(i<=N){
        
            System.out.println(i);
            i++;
        }
        
        System.out.println("----------------------");
        
        //Q Check age
        System.out.println("Enter Age");
        double age = sc.nextDouble();
        if(age>=18)
        {
        
            System.out.println("Can drive a car");
        }
        else
        {
            System.out.println("Can not drive a car");
        }
    }//main ends
}//class ends

import java.util.Scanner;

public class Grades {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        
    System.out.println("Enter your grade");
    result = sc.nextInt();
        
    if(result >= 90 && result <= 100)
    {
        System.out.println("A+");
    }
    else if (result >= 80 && result <= 90){
        System.out.println("A");
    }
    else if (result >= 70 && result <= 80){
        System.out.println("B");
    }
    else if (result >= 60 && result <= 70){
        System.out.println("C");
    }
    else if (result >= 50 && result <= 60){
        System.out.println("D");
    }
    else{
        System.out.println("FAIL");
    }
        
        
        
    }//main ends
    
    
}//class end

/* Students are given homework in maths, history and geometry.
Write a program that takes the time spent on each subject as input, 
and calculates and outputs the total number of hours and minutes spent on each subject, each on a new line. 
*/
import java.util.Scanner;

public class Time {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math ,history, geometry , minutes;
        
        System.out.println("Minutes spent on Maths ?");
        math = sc.nextInt();
        System.out.println("Minutes spent on History ?");
        history = sc.nextInt();
        System.out.println("Minutes spent on Geometry ?");
        geometry = sc.nextInt();
        
        minutes = 60;
        
        
        System.out.println("Total hours taken: "+(math + history + geometry)/ minutes);
        System.out.println("Total minutes taken: "+(math + history + geometry)% minutes);
    
        
        
        
        
    }
    
}

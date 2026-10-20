/*Q20: Write a program to display the day of the week based on a number (1–7) using switch-case.
Sample Test Cases:
Input 1:
1
Output 1:
Monday

Input 2:
5
Output 2:
Friday

*/
import java.util.Scanner;
public class ques20{    
    public static void main(String args[]){
        int day;
        System.out.println("Enter a number (1-7): ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
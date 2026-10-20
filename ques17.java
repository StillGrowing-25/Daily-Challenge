/*Q17: Write a program to find the roots of a quadratic equation and categorize them.
Sample Test Cases:
Input 1:
1 -3 2
Output 1:
Roots are real and different: 2, 1

Input 2:
1 -2 1
Output 2:
Roots are real and same: 1

Input 3:
1 2 5
Output 3:
Roots are complex

*/
import java.util.*;
public class ques17{

    public static void main(String args[]){
        int a, b,c;
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double r1 = (-b + Math.sqrt(b*b -4*a*c))/(2*a);
        double r2 = (-b - Math.sqrt(b*b -4*a*c))/(2*a);
        if(b*b -4*a*c > 0){
            System.out.println("Roots are real and different: "+r1+", "+r2);
        }else if(b*b -4*a*c == 0){
            System.out.println("Roots are real and same: "+r1);
        }else{
            System.out.println("Roots are complex");
        }
        sc.close();
    }
}
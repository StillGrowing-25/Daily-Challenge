/*Q9: Write a program to calculate simple and compound interest for given principal, rate, and time.
Sample Test Cases:
Input 1:
1000 5 2
Output 1:
Simple Interest=100, Compound Interest=102.5

Input 2:
5000 7 3
Output 2:
Simple Interest=1050, Compound Interest=1125.76

*/
import java.util.*;
public class ques9{
    public static void main(String args[]){
        double principal;
        int rate, time;
        System.out.println("Enter principal, rate and time: ");
        Scanner sc = new Scanner(System.in);
        principal = sc.nextDouble();
        rate = sc.nextInt();
        time = sc.nextInt();

        double si = (principal*rate*time)/100;
        double ci = principal*Math.pow(((1+rate/100.0)),time)-principal;

        System.out.println("Simple Interest = "+si+", Compound Interest = "+ci);
        sc.close();
    }
}

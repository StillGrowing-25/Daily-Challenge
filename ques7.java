/* Q7: Write a program to swap two numbers without using a third variable.

Sample Test Cases:
Input 1:
10 20
Output 1:
After swap: 20 10

Input 2:
7 14
Output 2:
After swap: 14 7

*/
import java.util.Scanner;
public class ques7{
public static void main(String args[]){
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        a =  a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap : "+ a + " "+ b);
        sc.close();
    }
}
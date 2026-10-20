/*Q1: Write a program to input two numbers and display their sum.

Sample Test Cases:
Input 1:
3 4
Output 1:
Sum = 7

Input 2:
-1 20
Output 2:
Sum = 19

*/
import java.util.Scanner;
public class ques1{

    public static void main(String args[]){
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("The sum of the numbers is: "+(a+b));
        sc.close();
    }
}
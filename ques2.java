/*Q2: Write a program to input two numbers and display their sum, difference, product, and quotient.
Sample Test Cases:
Input 1:
10 2
Output 1:
Sum=12, Diff=8, Product=20, Quotient=5

Input 2:
7 3
Output 2:
Sum=10, Diff=4, Product=21, Quotient=2

*/ 
import java.util.Scanner;
public class ques2{

    public static void main(String args[]){
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(b==0){
            System.out.println("Division by zero not possible");
        }else{
            System.out.println("Sum = "+ (a+b)+  ", Diff = "+(a-b)+", Product = "+(a*b)+", Quotient = "+(a/b));
            sc.close();
        }
    }
}
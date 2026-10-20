/*Q6: Write a program to swap two numbers using a third variable.
Sample Test Cases:
Input 1:
3 5
Output 1:
After swap: 5 3

Input 2:
-1 1
Output 2:
After swap: 1 -1

*/

import java.util.Scanner;
public class ques6{
public static void main(String args[]){
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("After swap : "+ a + " "+ b);
        sc.close();
    }
}
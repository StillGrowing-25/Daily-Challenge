/*
Q37: Write a program to find the LCM of two numbers.
Sample Test Cases:
Input 1:
4 5
Output 1:
20

Input 2:
7 3
Output 2:
21
*/

import java.util.Scanner;
public class ques37 {
    static int gcd(int a, int b) {
        
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

         if (a == 0 || b == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        int c = gcd(a,b) ;
        System.out.println((a/c)*b);

        sc.close();
    }
}
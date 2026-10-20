/*
Q36: Write a program to find the HCF (GCD) of two numbers.
Sample Test Cases:
Input 1:
12 18
Output 1:
6

Input 2:
7 9
Output 2:
1
*/
import java.util.*;
public class ques36 {
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

        int c = gcd(a,b);
        System.out.println(c);

        sc.close();
    }
}
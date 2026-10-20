/*
Q32: Write a program to check if a number is a palindrome.
Sample Test Cases:
Input 1:
121
Output 1:
Palindrome

Input 2:
123
Output 2:
Not palindrome
*/

import java.util.Scanner;
public class ques32 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n, rev = 0;

        if (n < 0) {
            System.out.println("Not Palindrome");
            sc.close();
            return;
        }
        while(n != 0){
            rev = rev*10 +(n%10);
            n = n/10;
        }
        
        if(rev == a){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
/*
Q43: Write a program to check if a number is a strong number.
Sample Test Cases:
Input 1:
145
Output 1:
Strong number

Input 2:
123
Output 2:
Not strong number
*/

import java.util.Scanner;
public class ques43 {
    static int fact(int n){
        if(n==0 || n== 1)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        if(n<=0){
            System.out.println("Not a strong number");
            sc.close();
            return;
        }
        
        int num = n;
        while(n != 0){
            sum += fact(n%10);
            n = n/10;
        }
        if(sum == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not a strong number");

        sc.close();
    }
}
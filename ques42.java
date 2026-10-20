/*
Q42: Write a program to check if a number is a perfect number.
Sample Test Cases:
Input 1:
6
Output 1:
Perfect number

Input 2:
10
Output 2:
Not perfect number
A perfect number is a positive integer that equals the sum of its proper positive divisors
*/

import java.util.Scanner;
public class ques42 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

        if(n <= 0){
            System.out.println("Not a Perfect number");
            sc.close();
            return;
        }
        for(int i =1; i<=n/2; i++){
            if(n%i == 0)
                sum+= i;
        }

        if(sum == n){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
        sc.close();
    }
}
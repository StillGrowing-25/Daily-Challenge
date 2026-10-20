/*
Q55: Write a program to print all the prime numbers from 1 to n.

Sample Test Cases:
Input 1:
10
Output 1:
2 3 5 7

Input 2:
20
Output 2:
2 3 5 7 11 13 17 19
*/

import java.util.*;
public class ques55 {
    static boolean isPrime(int n){
        if (n <= 1) return false;

        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i ==0)
                return false;
        }return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Invalid Input");
        }
        for(int i =2; i<=n; i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }

        sc.close();
    }
}
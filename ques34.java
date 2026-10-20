/*
Q34: Write a program to check if a number is prime.
Sample Test Cases:
Input 1:
7
Output 1:
Prime

Input 2:
10
Output 2:
Not prime
*/

import java.util.Scanner;

public class ques34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;

        if (n <= 1) {
            flag = false;
        } else {
        for (int i = 2; i <=  (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
    }
        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

        sc.close();
    }
}
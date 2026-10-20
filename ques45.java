/*
Q45: Write a program to find the sum of the series: 2/3 + 4/7 + 6/11 + 8/15 + ... up to n terms.
Sample Test Cases:
Input 1:
3
Output 1:
Approximate sum: 1.56

Input 2:
5
Output 2:
Approximate sum: 2.22
*/

import java.util.Scanner;

public class ques45 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = 2.0, b = 3.0;
        double sum = 0;

        if (n <= 0) {
            System.out.println("Approximate sum: 0.00");
            sc.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            sum += (a / b);
            a += 2;
            b += 4;
        }
        System.out.println(sum);

        sc.close();
    }
}
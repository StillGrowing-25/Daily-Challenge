/*
Q41: Write a program to swap the first and last digit of a number.
Sample Test Cases:
Input 1:
1234
Output 1:
4231

Input 2:
1001
Output 2:
1001
*/

import java.util.Scanner;
public class ques41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = n % 10;
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int power = (int) Math.pow(10, digits - 1);
        int first = n / power;
        int middle = (n % power) / 10;

        int result = last * power + middle * 10 + first;

        System.out.println(result);

        sc.close();
    }
}
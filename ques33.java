/*
Q33: Write a program to check if a number is an Armstrong number.
Sample Test Cases:
Input 1:
153
Output 1:
Armstrong

Input 2:
123
Output 2:
Not Armstrong
*/

import java.util.*;

public class ques33 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, num = n;
        int arms = 0;

        if (n == 0) {
            System.out.println("Armstrong");
            sc.close();
            return;
        }

        // Edge Case: Negative numbers cannot be Armstrong numbers
        if (n < 0) {
            System.out.println("Not Armstrong");
            sc.close();
            return;
        }
        while (n != 0) {
            n = n / 10;
            c++;
        }
        n = num;

        while (n != 0) {
            arms = arms + (int) Math.pow(n % 10, c);
            n = n / 10;
        }
        if (arms == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
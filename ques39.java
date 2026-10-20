/*
Q39: Write a program to find the product of odd digits of a number.
Sample Test Cases:
Input 1:
12345
Output 1:
15 (1*3*5)

Input 2:
2468
Output 2:
1 (no odd digits, assume 1)
*/

import java.util.Scanner;
public class ques39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        n = Math.abs(n);
        while(n != 0){
            if((n%10)%2 != 0)
                prod *= n%10;
            n = n/10;
        }
        System.out.println(prod);

        sc.close();
    }
}
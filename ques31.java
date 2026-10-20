/*
Q31: Write a program to take a number as input and print its equivalent binary representation.
Sample Test Cases:
Input 1:
10
Output 1:
1010

Input 2:
7
Output 2:
111
*/

import java.util.*;
public class ques31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        int i = 0;
        if (n == 0) {
            System.out.println("0");
            sc.close();
            return;
        }
        while(n != 0){
            ans = (long)(ans + (n%2)*Math.pow(10,i++));
            n = n/2;
        }

        System.out.println(ans);
        sc.close();
    }
}
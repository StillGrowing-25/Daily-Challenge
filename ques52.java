/*
Q52: Write a program to print the following pattern:

*

*
*
*

*
*
*
*
*

*
*
*

*

Sample Test Cases:
Input 1:

Output 1:
Pattern with stars spaced irregularly as shown.
*/

import java.util.Scanner;
public class ques52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n;i+=2){
            for(int j = 0; j<=i;j++){
                System.out.println("*");
            }System.out.println();
        }
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }


        sc.close();
    }
}
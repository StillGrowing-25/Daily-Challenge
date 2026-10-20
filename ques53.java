/*
Q53: Write a program to print the following pattern:
*
***
*****
*******
*********
*******
*****
***
*

Sample Test Cases:
Input 1:

Output 1:
*
***
*****
*******
*********
*******
*****
***
*
*/

import java.util.Scanner;
public class ques53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<n; i+=2){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }

        for(int i =1; i<=n; i+=2){
            for(int j = n; j>=i;j--){
                System.out.print("*");
            }System.out.println();
        }

        sc.close();
    }
}
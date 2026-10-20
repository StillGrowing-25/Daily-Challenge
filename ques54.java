/*
Q54: Write a program to print the following pattern:

   *
  ***
 *****
*******
 *****
  ***
   *

Sample Test Cases:
Input 1:

Output 1:
Pattern with layers of stars as shown.
*/

import java.util.Scanner;
public class ques54 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1 ; i<= n ;i++){
            for(int j = n; j>i;j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1);j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i =n-1 ; i>=1 ;i--){
            for(int j = n; j>i;j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1);j++){
                System.out.print("*");
            }System.out.println();
        }

        sc.close();
    }
}
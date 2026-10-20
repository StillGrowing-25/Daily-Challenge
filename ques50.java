/*
Q50: Write a program to print the following pattern:
*****
 ****
  ***
   **
    *

Sample Test Cases:
Input 1:

Output 1:
*****
 ****
  ***
   **
    *

Input 2:

Output 2:
Note: Spaces indicate indentation.
*/

import java.util.Scanner;
public class ques50 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = n; j>i; j--){
                System.out.print("*");
            }System.out.println();
        }


        sc.close();
    }
}
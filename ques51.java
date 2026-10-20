/*
Q51: Write a program to print the following pattern:
    5
   45
  345
 2345
12345

Sample Test Cases:
Input 1:

Output 1:
    5
   45
  345
 2345
12345
*/

import java.util.Scanner;
public class ques51 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            for(int j =n; j>i-1; j--){
                System.out.print(" ");
            }
            for(int j = n-i; j<=n; j++){
                System.out.print(j);
            }System.out.println();
        }

        sc.close();
    }
}
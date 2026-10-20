/*
Q35: Write a program to print all factors of a given number.
Sample Test Cases:
Input 1:
6
Output 1:
1 2 3 6

Input 2:
10
Output 2:
1 2 5 10
*/

import java.util.Scanner;
public class ques35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i <= n ; i++){
            if(n%i == 0)
                System.err.print(i + " ");
        }

        sc.close();
    }
}
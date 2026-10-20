/*
Q46: Write a program to print the following pattern:
*****
*****
*****
*****
*****


Sample Test Cases:
Input 1:

Output 1:
*****
*****
*****
*****
*****

*/


import java.util.Scanner;
public class ques46 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        for(int i =0; i<n; i++){
            for(int j =0; j<n;j++){
                System.out.print("*");
            }System.out.println();
        }

        sc.close();
    }
}
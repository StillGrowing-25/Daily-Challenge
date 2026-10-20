/*Q8: Write a program to find and display the sum of the first n natural numbers.


Sample Test Cases:
Input 1:
5
Output 1:
Sum=15

Input 2:
10
Output 2:
Sum=55

*/

import java.util.Scanner;
public class ques8{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
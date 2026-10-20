/*
Q44: Write a program to find the sum of the series: 1 + 3/4 + 5/6 + 7/8 + … up to n terms.
Sample Test Cases:
Input 1:
3
Output 1:
Approximate sum: 2.58

Input 2:
5
Output 2:
Approximate sum: 4.35
*/

import java.util.Scanner;
public class ques44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 1;
        double a = 3.0, b = 4.0;

        if(n<1){
            System.err.println("Inavlid input");
        }else if( n == 0 || n == 1){
            System.out.println(n);
        }else{
            for(int i=2; i<=n; i++){
                sum += (a/b);
                a+=2;
                b+=2;
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
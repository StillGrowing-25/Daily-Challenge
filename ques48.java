/*
Q48: Write a program to print the following pattern:
1
12
123
1234
12345

Sample Test Cases:
Input 1:

Output 1:
1
12
123
1234
12345
*/

import java.util.Scanner;
public class ques48 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }System.out.println();
        }

        sc.close();
    }
}
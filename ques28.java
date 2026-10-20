/*
Q28: Write a program to print the product of even numbers from 1 to n.

/*
Sample Test Cases:
Input 1:
4
Output 1:
8 (2 * 4)

Input 2:
6
Output 2:
48 (2 * 4 * 6)

*/
import java.util.Scanner;
public class ques28 {
    public static void main(String args[]) {
        int n, product = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            product *= i;
        }

        System.out.println(product);
        sc.close();
    }
}
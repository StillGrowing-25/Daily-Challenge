
/*Q29: Write a program to calculate the factorial of a number.
Sample Test Cases:
Input 1:
5
Output 1:
120

Input 2:
3
Output 2:
6

*/
import java.util.Scanner;

public class ques29 {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String args[]) {

        int n;
        
        System.out.println("Enter a number: ");
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println(factorial(n));
        sc.close();
    }
}
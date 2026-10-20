/*Q11: Write a program to input an integer and check whether it is even or odd using if–else.
Sample Test Cases:
Input 1:
7
Output 1:
7 is odd

Input 2:
12
Output 2:
12 is even

*/
import java.util.Scanner;
public class ques11{

    public static void main(String args[]){
        int a;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a%2 == 0)
            System.out.println(a + " is even");
        else
            System.out.println(a + " is odd");

        sc.close();
    }
}
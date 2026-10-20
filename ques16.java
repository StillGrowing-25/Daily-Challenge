/*Q16: Write a program to input three numbers and find the largest among them using if–else.
Sample Test Cases:
Input 1:
3 7 5
Output 1:
Largest is 7

Input 2:
-1 -5 0
Output 2:
Largest is 0

*/
import java.util.Scanner;
public class ques16{

    public static void main(String args[]){
        int a, b,c;
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest is "+a);
        }else if(b>a && b>c){
            System.out.println("Largest is "+b);
        }else{
            System.out.println("Largest is "+c);
        }
        sc.close();
    }
}
/*Q4: Write a program to calculate the area and circumference of a circle given its radius.
Sample Test Cases:
Input 1:
7
Output 1:
Area=153.94, Circumference=43.96

Input 2:
3
Output 2:
Area=28.27, Circumference=18.85

*/
import java.util.Scanner;
public class ques4{

    public static void main(String args[]){
        int r;
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        double pi = 3.14;

        System.out.println("Area = "+ (pi * r * r) + ", Circumference = "+ 2*pi*r);
        sc.close();
    }
}
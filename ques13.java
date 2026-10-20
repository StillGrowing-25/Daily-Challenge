/*Q13: Write a program to input a year and check whether it is a leap year or not using conditional statements.
Sample Test Cases:
Input 1:
2020
Output 1:
Leap year

Input 2:
1900
Output 2:
Not a leap year

Input 3:
2000
Output 3:
Leap year

*/
import java.util.Scanner;
public class ques13{
    public static void main(String args[]){
        int year;
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if((year%4 == 0 && year%100 != 0)||(year%400 == 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
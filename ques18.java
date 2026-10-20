/*Q18: Write a program that accepts a percentage (0-100) and assigns a grade based on the following criteria: 
90-100: Grade A 
80-89: Grade B 
70-79: Grade C 
60-69: Grade D 
below 60: Grade F.


Sample Test Cases:
Input 1:
95
Output 1:
Grade A

Input 2:
82
Output 2:
Grade B

Input 3:
68
Output 3:
Grade D

Input 4:
50
Output 4:
Grade F

*/
import java.util.Scanner;
public class ques18{
    public static void main(String args[]){
        int percentage;
        System.out.println("Enter the percentage: ");
        Scanner sc = new Scanner(System.in);
        percentage = sc.nextInt();
        if(percentage >= 90 && percentage <= 100){
            System.out.println("Grade A");
        }else if(percentage >= 80 && percentage < 90){
            System.out.println("Grade B");
        }else if(percentage >= 70 && percentage < 80){
            System.out.println("Grade C");
        }else if(percentage >= 60 && percentage < 70){
            System.out.println("Grade D");
        }else if(percentage < 60){
            System.out.println("Grade F");
        }else{
            System.out.println("Invalid percentage");
        }
        sc.close();
    }
}
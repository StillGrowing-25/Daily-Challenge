/*Q19: Write a program to classify a triangle as Equilateral, Isosceles, or Scalene based on its side lengths.
Sample Test Cases:
Input 1:
3 3 3
Output 1:
Equilateral

Input 2:
3 3 4
Output 2:
Isosceles

Input 3:
2 3 4
Output 3:
Scalene

*/
import java.util.Scanner;
public class ques19{
    public static void main(String args[]){
        int a, b, c;
        System.out.println("Enter three sides of a triangle: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a == b && b == c){
            System.out.println("Equilateral");
        }else if(a == b || b == c || a == c){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
        sc.close();
    }
}
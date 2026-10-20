
/*Q5: Write a program to convert temperature from Celsius to Fahrenheit.
Sample Test Cases:
Input 1:
0
Output 1:
Fahrenheit=32

Input 2:
100
Output 2:
Fahrenheit=212

*/
import java.util.Scanner;

public class ques5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double temp_c;
        System.out.println("Enter temperature in Celsius: ");
        temp_c = sc.nextDouble();

        double temp_f = (temp_c * (9.0 / 5.0) )+ 32;
        System.out.println("Fahrenheit = " + temp_f);
        sc.close();
    }
}
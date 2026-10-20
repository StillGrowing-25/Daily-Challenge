/*Q15: Write a program to input a character and check whether it is an uppercase alphabet, lowercase alphabet, digit, or special character.
Sample Test Cases:
Input 1:
A
Output 1:
Uppercase alphabet

Input 2:
a
Output 2:
Lowercase alphabet

Input 3:
3
Output 3:
Digit

Input 4:
#
Output 4:
Special character

*/
import java.util.Scanner;
public class ques15{
    public static void main(String args[]){
        char ch;
        System.out.println("Enter an alphabet");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if(ch >= 'a' && ch<='z'){
            System.out.println("Lowercase");
        }else if(ch >= 'A' && ch<='Z'){
            System.out.println("Uppercase");
        }else if(ch >= '0' && ch<='9'){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }

        sc.close();
    }
}
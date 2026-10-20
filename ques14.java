/*Q14: Write a program to input a character and check whether it is a vowel or consonant using if–else.
Sample Test Cases:
Input 1:
a
Output 1:
Vowel

Input 2:
b
Output 2:
Consonant


*/
import java.util.Scanner;
public class ques14{
    public static void main(String args[]){
        char ch;
        System.out.println("Enter an alphabet");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}
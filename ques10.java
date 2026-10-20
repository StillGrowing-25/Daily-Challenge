/*Q10: Write a program to input time in seconds and convert it to hours:minutes:seconds format.
Sample Test Cases:
Input 1:
3661
Output 1:
1:1:1

Input 2:
7322
Output 2:
2:2:2

*/
import java.util.*;
public class ques10{
    public static void main(String args[]){
        int seconds;
        System.out.println("Enter time in seconds: ");
        Scanner sc = new Scanner(System.in);
        seconds = sc.nextInt();

        System.out.println(seconds/3600+":"+(seconds%3600)/60+":"+((seconds%3600)%60));
        sc.close();
    }
}
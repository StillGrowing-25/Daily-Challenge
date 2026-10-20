/*Q23: Write a program to calculate library fine based on late days as follows: 
First 5 days late: ₹2/day 
Next 5 days late: ₹4/day 
Next 20 days days late: ₹6/day 
More than 30 days: Membership Cancelled.


Sample Test Cases:
Input 1:
4
Output 1:
Fine ₹8

Input 2:
8
Output 2:
Fine ₹22

Input 3:
15
Output 3:
Fine ₹60

Input 4:
31
Output 4:
Membership Cancelled

*/
import java.util.Scanner;
public class ques23 {
    public static void main(String args[]) {
        int days;
        System.out.println("Enter the number of late days: ");
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();
        if (days <= 5) {
            System.out.println("Fine ₹" + (days * 2));
        } else if (days <= 10) {
            System.out.println("Fine ₹" + (5 * 2 + (days - 5) * 4));
        } else if (days <= 30) {
            System.out.println("Fine ₹" + (5 * 2 + 5 * 4 + (days - 10) * 6));
        } else {
            System.out.println("Membership Cancelled");
        }
        sc.close();
    }
}
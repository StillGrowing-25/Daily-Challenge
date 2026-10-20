/*Q22: Write a program to find profit or loss percentage given cost price and selling price.

Sample Test Cases:
Input 1:
1000 1200
Output 1:
Profit 20%

Input 2:
1000 800
Output 2:
Loss 20%

Input 3:
1000 1000
Output 3:
No Profit No Loss

*/
import java.util.Scanner;
public class ques22 {
    public static void main(String args[]) {
        System.out.println("Enter the month number: ");
        Scanner sc = new Scanner(System.in);
        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
        int profitLoss = sellingPrice - costPrice;
        if (profitLoss > 0) {
            System.out.println("Profit " + (profitLoss * 100 / costPrice) + "%");
        } else if (profitLoss < 0) {
            System.out.println("Loss " + (-profitLoss * 100 / costPrice) + "%");
        } else {
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}
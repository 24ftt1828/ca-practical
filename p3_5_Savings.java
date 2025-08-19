import java.util.Scanner;
 
public class p3_5_Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is target amount? $ ");
        double targetAmount = input.nextDouble();

        System.out.println("How many month(s) to reach the goal?");
        int months = input.nextInt();

        int totalDays = months * 30;
        double dailySavings = targetAmount / totalDays;

        System.out.printf("The amount needed to be save daily is $%.2f\n", dailySavings);
    }
    
}

import java.util.Scanner;

public class p3_4_NumberOfDurian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double durianPrice = 15.75;
        System.out.println("Each durian costs: " + durianPrice);
        
        System.out.print("how much money do you have?$ ");
        double userMoney = input.nextDouble();

        int numberOfDurians = (int) (userMoney / durianPrice);

        System.out.println("Number of durian you can buy " + numberOfDurians);
    }
}

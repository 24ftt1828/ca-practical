import java.util.Scanner;

public class p2_3_PrintTable {
    public static void main(String[] args) {
        System.out.printf("%-5s%-5s%-5s\n", "a", "a^2", "a^3");
        for (int a = 1; a <= 4; a++) {
            int aSquared = a * a;
            int aCubed = a * a * a;
            System.out.printf("%-5d%-5d%-5d\n", a, aSquared, aCubed);
        }
    }
}

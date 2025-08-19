import java.util.Scanner;

public class p3_3_CharacterToUnicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:");
        char character = input.next().charAt(0);

        int unicode = character;

        System.out.println("The Unicode for character " + character + " is: " + unicode);
        
    }
}

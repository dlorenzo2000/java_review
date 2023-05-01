
/*
 * Mon May 1, 2023 0859hrs
 * Chapter 3, Page 146
 */
import java.util.Scanner;

public class CharacterMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character > ");

        String input = scan.next();

        char c = input.charAt(0);

        System.out.printf("The unicode decimal value of '%c' is %d: \n", c, (int) c);
    }
}
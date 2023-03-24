package writinghomework;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.converUppercaseToLowerCase(uppercase);
        scanner.close();
    }
    // Conversion of Uppercase to lower case method
    public void converUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is + " + text.toLowerCase());
    }
}

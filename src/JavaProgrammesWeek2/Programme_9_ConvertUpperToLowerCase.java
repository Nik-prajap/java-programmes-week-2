package JavaProgrammesWeek2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner Declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Upper case String : ");
        String upperCase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(upperCase);
        //closing the scanner object
        scanner.close();
    }

    //Conversion of Upper case to lower case method.
    public void convertUpperCaseToLowerCase(String text) {
        System.out.println("The Lower case value is : " + text.toLowerCase());
    }
}

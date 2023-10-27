package JavaProgrammesWeek2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ( (F - 32) * 5/9 ) = 0°C.
 */
public class Programme_7_TempConversion {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console.
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the temperature in Fahrenheit : ");
        float temp = scanner.nextFloat();
        //Object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTemToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
    }

    //Temperature conversion method.
    public void convertTemToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " Fahrenheit is equal to " + c + " °C ");
    }
}

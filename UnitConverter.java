/**
 * Version: 1.1
 * Feature: Temperature conversion (C ↔ F)
 */

package csm_project;

/**
 *
 * @author FARAH
 */
import java.util.Scanner;

public class UnitConverter {

    public static double kilometersToMiles(double km) {
        return km * 0.62;
    }

    public static double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Unit Converter ===");

        // كيلومتر إلى ميل
        System.out.print(" in Km: ");
        double km = scanner.nextDouble();
        double miles = kilometersToMiles(km);
        System.out.println(km + " km = " + miles + " miles");

        // ميل إلى كيلومتر
        System.out.print("in mile: ");
        double mi = scanner.nextDouble();
        double kms = milesToKilometers(mi);
        System.out.println(mi + " miles = " + kms + " km");
        // C TO F
        System.out.print("Enter temperature in Celsius: ");
        double c = scanner.nextDouble();
        System.out.println(c + "°C = " + celsiusToFahrenheit(c) + "°F");
        // F TO C
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = scanner.nextDouble();
         System.out.println(f + "°F = " + fahrenheitToCelsius(f) + "°C");

        scanner.close();
    }
}


   

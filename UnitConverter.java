/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csm_project;

/**
 *
 * @author FARAH
 */
import java.util.Scanner;

public class UnitConverter {

    public static double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles / 0.621371;
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

        scanner.close();
    }
}


   

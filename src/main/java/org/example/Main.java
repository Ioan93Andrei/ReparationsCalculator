package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount of people to receive reparations: ");
        long amountOfPeople = scanner.nextLong();

        System.out.print("Amount of reparations in dollars: ");
        long amountOfDollars = scanner.nextLong();

        scanner.close();

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        long total = amountOfPeople * amountOfDollars;
        String formattedTotal = decimalFormat.format(total);

        System.out.print("The amount of reparations money to be paid is: " + formattedTotal + "$");
    }
}
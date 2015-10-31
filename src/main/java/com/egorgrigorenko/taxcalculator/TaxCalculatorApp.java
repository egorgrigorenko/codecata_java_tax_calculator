package com.egorgrigorenko.taxcalculator;

import java.util.Scanner;

public class TaxCalculatorApp
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dollars: $");
        double dollars = in.nextDouble();
        System.out.print("Enter tax in percent (e.g. 10): ");
        double percent = in.nextDouble();

        TaxCalculator calculator = new TaxCalculator();
        double grandTax = calculator.calculate(dollars, percent);
        System.out.println("Grand tax is $" + grandTax);
    }
}

package com.egorgrigorenko.taxcalculator;

/**
 * Created by Egor Grigorenko on 31.10.2015.
 */
public class TaxCalculator {
    public double calculate(double dollars, double percent) {
        return dollars + dollars * percent / 100;
    }
}

package com.egorgrigorenko.taxcalculator;

public class TaxCalculator {
    public double calculate(double dollars, double percent) {
        return dollars + dollars * percent / 100;
    }
}

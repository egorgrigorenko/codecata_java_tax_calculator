package com.egorgrigorenko.taxcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaxCalculatorTest {
    @Test
    public void calculate_WHEN_20_percent_THEN_1_20() {
        TaxCalculator calculator = new TaxCalculator();
        assertEquals(1.2, calculator.calculate(1, 20), 0.000001);
    }
}

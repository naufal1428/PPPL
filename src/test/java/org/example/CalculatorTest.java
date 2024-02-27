package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void penjumlahanNilaiPositif() {
        Calculator calc = new Calculator(3,4);
        //expected value adalah 7
        int hasil = calc.penjumlahan();
        assertEquals(7, hasil);
    }

    @Test
    void testPenjumlahanNilaiNegatif() {
        Calculator calc = new Calculator(-3,-4);
        int hasil = calc.penjumlahan();
        assertEquals(-7, hasil);
    }
}
package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

//class CalculatorTest {
//
////    @Test
////    void penjumlahanNilaiPositif() {
////        Calculator calc = new Calculator(3,4);
////        //expected value adalah 7
////        int hasil = calc.penjumlahan();
////        assertEquals(7, hasil);
////    }
////
////    @Test
////    void testPenjumlahanNilaiNegatif() {
////        Calculator calc = new Calculator(-3,-4);
////        int hasil = calc.penjumlahan();
////        assertEquals(-7, hasil);
////    }
//
//
//}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ClassName {
    private int nilai1 = 2, nilai2 = 3;

    @Test
    void testPenjumlahanNilaiPositif() {

    }
}
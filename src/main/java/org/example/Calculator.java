package org.example;

public class Calculator {

    private int nilai1;
    private int nilai2;

    Calculator(int nilai1, int nilai2) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }

    public  int penjumlahan() {
        return  nilai1 + nilai2;
    }



    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }
}

package org.example;

import java.util.ArrayList;

public class Wallet {

    String owner;
    double uangCash;
    ArrayList<String> listKartu;


    public Wallet(String owner, double uangCash, ArrayList<String> listKartu) {
        this.owner = owner;
        this.uangCash = uangCash;
        this.listKartu = listKartu;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return uangCash;
    }

    public ArrayList<String> getListKartu() {
        return listKartu;
    }

    public void withdraw(double amount) {
        if (this.uangCash < amount) {
            throw new Error("Uang Anda tidak cukup");
        }
        this.uangCash = this.uangCash - amount;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new Error("Jumlah uang tidak valid");
        }
        this.uangCash = this.uangCash + amount;
    }

    public void addCard(String idCard) {
        this.listKartu.add(idCard);
    }

    public void  removeCard(String idCard) {
        boolean isDeleted = this.listKartu.remove(idCard);
        if (!isDeleted) {
            throw new Error("Kartu tidak ditemukan");
        }
    }
}

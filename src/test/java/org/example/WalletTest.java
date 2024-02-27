package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test
    void testWithdraw() {
        Wallet wallet = new Wallet("Joko", 123, new ArrayList<>());
        wallet.withdraw(10);
        assertEquals(113, wallet.getBalance());
    }

    @Test
    void testWithdrawInsufficientCash() {
        final double UANG_AWAL = 123;
        Wallet wallet = new Wallet("Joko", UANG_AWAL, new ArrayList<>());
        assertThrows(Error.class, () -> {
            wallet.withdraw(99999);
        });
        assertEquals(UANG_AWAL, wallet.getBalance());
    }

    @Test
    void testDeposit() {
        Wallet wallet = new Wallet("Joko", 10000, new ArrayList<>());
        wallet.deposit(4000);
        assertEquals(14000, wallet.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        Wallet wallet = new Wallet("Joko", 10000, new ArrayList<>());
        assertThrows(Error.class, () -> {
            wallet.deposit(-4000);
        });
        assertEquals(10000, wallet.getBalance());
    }

    @Test
    void testAddCard() {
        Wallet wallet = new Wallet("Joko", 10000, new ArrayList<>());
        wallet.addCard("1234");
        assertEquals(1, wallet.getListKartu().size());
        assertTrue(wallet.getListKartu().contains("1234"));
    }

    @Test
    void testRemoveCard() {
        Wallet wallet = new Wallet("Joko", 10000, new ArrayList<>());
        wallet.addCard("1234");
        wallet.removeCard("1234");
        assertEquals(0, wallet.getListKartu().size());
        assertFalse(wallet.getListKartu().contains("1234"));
    }

    @Test
    void testSetOwner() {
        Wallet wallet = new Wallet("Joko", 10000, new ArrayList<>());
        wallet.setOwner("Budi");
        assertEquals("Budi", wallet.getOwner());
    }

    @Test
    void testGetOwner() {
        Wallet wallet = new Wallet("Joko", 10000, new ArrayList<>());
        assertEquals("Joko", wallet.getOwner());
    }

    @Test
    void testGetBalance() {
        Wallet wallet = new Wallet("Joko", 10000, new ArrayList<>());
        assertEquals(10000, wallet.getBalance());
    }

    @Test
    void testGetListKartu() {
        ArrayList<String> listKartu = new ArrayList<>();
        listKartu.add("1234");
        listKartu.add("5678");
        Wallet wallet = new Wallet("Joko", 10000, listKartu);
        assertEquals(listKartu, wallet.getListKartu());
    }
}
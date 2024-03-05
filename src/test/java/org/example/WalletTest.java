package org.example;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WalletTest {

    private Wallet wallet;

    @BeforeEach
    void initMethod() {
        wallet = new Wallet("Joko", 10000, new ArrayList<>());
        System.out.println("@BeforeEach dijalankan");
    }

    @AfterEach
    void cleanMethod() {
        wallet = null;
        System.out.println("@AfterEach dijalankan");
    }

    @Test
    void testWithdraw() {
        wallet.withdraw(1800);
        assertEquals(8200, wallet.getBalance());
        System.out.println("Menjalankan test method withdraw");
    }

    @Test
    void testWithdrawInsufficientCash() {
        assertThrows(Error.class, () -> {
            wallet.withdraw(99999);
        });
        assertEquals(10000, wallet.getBalance());
        System.out.println("Menjalankan test method withdraw insufficent cash");
    }

    @Test
    void testDeposit() {
        wallet.deposit(4000);
        assertEquals(14000, wallet.getBalance());
        System.out.println("Menjalankan test method deposit");
    }

    @Test
    void testDepositNegativeAmount() {
        assertThrows(Error.class, () -> {
            wallet.deposit(-4000);
        });
        assertEquals(10000, wallet.getBalance());
        System.out.println("Menjalankan test method deposit negative amount");
    }

    @Test
    void testAddCard() {
        wallet.addCard("1234");
        assertEquals(1, wallet.getListKartu().size());
        assertTrue(wallet.getListKartu().contains("1234"));
        System.out.println("Menjalankan test method add card");
    }

    @Test
    void testRemoveCard() {
        wallet.addCard("1234");
        wallet.removeCard("1234");
        assertEquals(0, wallet.getListKartu().size());
        assertFalse(wallet.getListKartu().contains("1234"));
        System.out.println("Menjalankan test method remove card");
    }

    @Test
    void testSetOwner() {
        wallet.setOwner("Budi");
        assertEquals("Budi", wallet.getOwner());
        System.out.println("Menjalankan test method set owner");
    }

    @Test
    void testGetOwner() {
        assertEquals("Joko", wallet.getOwner());
        System.out.println("Menjalankan test method get owner");
    }

    @Test
    void testGetBalance() {
        assertEquals(10000, wallet.getBalance());
        System.out.println("Menjalankan test method get balance");
    }

    @Test
    void testGetListKartu() {
        ArrayList<String> listKartu = new ArrayList<>();
        listKartu.add("1234");
        listKartu.add("5678");
        Wallet wallet = new Wallet("Joko", 10000, listKartu);
        assertEquals(listKartu, wallet.getListKartu());
        System.out.println("Menjalankan test method get list kartu");
    }
}
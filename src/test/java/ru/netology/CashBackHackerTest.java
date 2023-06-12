package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}
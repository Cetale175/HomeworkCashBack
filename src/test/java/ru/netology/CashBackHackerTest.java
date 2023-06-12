package ru.netology;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackerTest {

    @org.junit.Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
}
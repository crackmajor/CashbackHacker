package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void testRemainWithAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
}
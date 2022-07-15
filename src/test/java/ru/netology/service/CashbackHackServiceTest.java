package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void remainTest(){
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void remainTestWithAmountMoreBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
}
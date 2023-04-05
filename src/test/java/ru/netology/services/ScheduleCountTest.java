package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleCountTest {

    @Test
    public void threeMonthsRest () {
        ScheduleCount service = new ScheduleCount ();
        int expected = 3;

        int income = 10_000;
        int expences = 3_000;
        int treshold = 20_000;

        int actual = service.calculate(income, expences, treshold);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void twoMonthsRest () {
        ScheduleCount service = new ScheduleCount ();
        int expected = 2;

        int income = 100_000;
        int expences = 60_000;
        int treshold = 150_000;

        int actual = service.calculate(income, expences, treshold);

        Assertions.assertEquals(expected, actual);
    }

}

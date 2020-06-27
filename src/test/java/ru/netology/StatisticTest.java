package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticTest {
    Statistic service = new Statistic();
    long[] incomesInBillions = {1, 2, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    @Test
    void findMax() {
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSum() {
        long expected = 76;

        long actual = service.calculateSum(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        long expected = 6;
        long actual = service.calculateAverage(incomesInBillions);

        assertEquals(expected, actual);
    }
}
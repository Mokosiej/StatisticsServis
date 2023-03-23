package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void testSum(){
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;


        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testAverage(){
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18) / 12;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMaximum(){
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaximumSale(sales);
        long expected = 8;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinimum() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinimumSale(sales);
        long expected = 9;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testBelowAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthBelowAverage(sales);
        long expected = 5;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAboveAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthAboveAverage(sales);
        long expected = 5;


        Assertions.assertEquals(expected, actual);
    }



}
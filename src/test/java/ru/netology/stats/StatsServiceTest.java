package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int result = service.calculateSum(sumSales);
        assertEquals(expected, result);
    }
    @Test
    void findAvg() {
        StatsService service = new StatsService();
        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int result = service.findAvg(sumSales);
        assertEquals(expected, result);
    }
    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int result = service.maxSales(sumSales);
        assertEquals(expected, result);
    }
    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int result = service.minSales(sumSales);
        assertEquals(expected, result);
    }
    @Test
    void minAvgMonth() {
        StatsService service = new StatsService();
        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int result = service.minAvgMonth(sumSales);
        assertEquals(expected, result);
    }
    @Test
    void maxAvgMonth() {
        StatsService service = new StatsService();
        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int result = service.maxAvgMonth(sumSales);
        assertEquals(expected, result);
    }



    }


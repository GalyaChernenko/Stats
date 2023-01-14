package ru.netology.qa52.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);

        int expectedMid = 15;
        int actualMid = service.midMonthSales(sales);
        Assertions.assertEquals(expectedMid, actualMid);

        int expectedMonthMax = 8;
        int actualMonthMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMonthMax, actualMonthMax);

        int expectedMonthMin = 9;
        int actualMonthMin = service.minSales(sales);
        Assertions.assertEquals(expectedMonthMin, actualMonthMin);

        int expectednumMonthLessMid = 5;
        int actualnumMonthLessMid = service.numMonthLessMid(sales);
        Assertions.assertEquals(expectednumMonthLessMid, actualnumMonthLessMid);

        int expectednumMonthMoreMid = 5;
        int actualnumMonthMoreMid = service.numMonthMoreMid(sales);
        Assertions.assertEquals(expectednumMonthMoreMid, actualnumMonthMoreMid);

    }

}

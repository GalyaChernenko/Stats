package ru.netology.qa52.stats;

public class StatsService {


    public int sumSales(int[] sales) {

        int sumAllSales = 0;
        for (int sale : sales) {
            sumAllSales = sumAllSales + sale;


        }
        return sumAllSales;
    }

    public int midMonthSales(int[] sales) {

        int amoundMonth = sales.length;
        int allAmountSales = sumSales(sales);


        return (allAmountSales / amoundMonth);

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numMonthLessMid(int[] sales) {

        int midSale = midMonthSales(sales);
        int monthCount = 0;

        for (int sale : sales) {
            if (sale < midSale) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int numMonthMoreMid(int[] sales) {

        int midSale = midMonthSales(sales);
        int monthCount = 0;

        for (int sale : sales) {
            if (sale > midSale) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;

    }
}
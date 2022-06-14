package ru.netology.javaqa.javaqamvn.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int allSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int allSale = allSales(sales);
        int average = allSale / sales.length;
        return average;
    }

    public int downAverage(long[] sales) {
        int average = averageSales(sales);
        int down = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                down = down + 1;
            }
        }
        return down;
    }


    public int upAverage(long[] sales) {
        int average = averageSales(sales);
        int up = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                up = up + 1;
            }
        }
        return up;
    }
}


package com.financial.forecast;

public class ForecastDemo {
    public static void main(String[] args) {
        double presentValue = 10000.0; // initial amount
        double growthRate = 0.08;      // 8% annual growth
        int years = 5;                 // number of years

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f\n", years, futureValue);
    }
}

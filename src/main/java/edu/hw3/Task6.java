package edu.hw3;

import java.util.PriorityQueue;

public class Task6 {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarketImpl();

        Stock stock1 = new Stock("Apple Inc.", 150.0);
        Stock stock2 = new Stock("Microsoft Corp.", 200.0);
        Stock stock3 = new Stock("Amazon.com Inc.", 3000.0);

        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);

        System.out.println("Most Valuable Stock: " + stockMarket.mostValuableStock().getName());
    }
}

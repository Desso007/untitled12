package edu;
import edu.hw3.Stock;
import edu.hw3.StockMarketImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import edu.hw3.StockMarket;
public class Task6test {
    private StockMarket stockMarket;

    @BeforeEach
    void setUp() {
        stockMarket = new StockMarketImpl();
    }

    @Test
    void testMostValuableStock() {
        Stock stock1 = new Stock("Apple Inc.", 150.0);
        Stock stock2 = new Stock("Microsoft Corp.", 200.0);
        Stock stock3 = new Stock("Amazon.com Inc.", 3000.0);

        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);

        assertEquals("Amazon.com Inc.", stockMarket.mostValuableStock().getName());
    }

    @Test
    void testAddAndRemoveStock() {
        Stock stock1 = new Stock("Apple Inc.", 150.0);
        Stock stock2 = new Stock("Microsoft Corp.", 200.0);

        stockMarket.add(stock1);
        stockMarket.add(stock2);

        assertEquals("Microsoft Corp.", stockMarket.mostValuableStock().getName());

        stockMarket.remove(stock1);

        assertEquals("Microsoft Corp.", stockMarket.mostValuableStock().getName());
    }
}
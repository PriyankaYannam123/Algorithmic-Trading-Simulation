import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TradeOrder {
    private String symbol;
    private double price;
    private int quantity;

    public TradeOrder(String symbol, double price, int quantity) {
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
    }

    public void executeTrade() {
        System.out.println("Executing trade: " + quantity + " shares of " + symbol + " at $" + price);
    }
}

class TradingEngine implements Runnable {
    private TradeOrder order;

    public TradingEngine(TradeOrder order) {
        this.order = order;
    }

    @Override
    public void run() {
        order.executeTrade();
    }
}

public class AlgorithmicTrading {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Example of creating multiple buy orders
        TradeOrder order1 = new TradeOrder("AAPL", 150.25, 100);
        TradeOrder order2 = new TradeOrder("GOOG", 2800.50, 50);
        TradeOrder order3 = new TradeOrder("AMZN", 3400.75, 200);

        executor.submit(new TradingEngine(order1));
        executor.submit(new TradingEngine(order2));
        executor.submit(new TradingEngine(order3));

        executor.shutdown();
    }
}

# Algorithmic-Trading-Simulation
# Algorithmic Trading Simulation

## Description:
This project implements a **basic algorithmic trading engine** using **Java**. The trading engine simulates **buy/sell orders** based on predefined rules and optimizes trade execution using **multithreading** to handle **real-time data feeds** for market analysis. 

## Technologies Used:
- Java
- Multithreading
- Executor Service (for concurrent tasks)
- Algorithms for simulating buy/sell logic

## Features:
- Simulates stock trading with predefined trading rules
- Optimized trade execution using multithreading for concurrent processing
- Real-time simulation of market data for trading decisions

## How to Run:
1. Clone the repository.
2. Compile and run the `AlgorithmicTrading.java` file.
3. Observe the simulated trades printed in the console.

## Example:
```java
TradeOrder order1 = new TradeOrder("AAPL", 150.25, 100);
TradeOrder order2 = new TradeOrder("GOOG", 2800.50, 50);
executor.submit(new TradingEngine(order1));
executor.submit(new TradingEngine(order2));

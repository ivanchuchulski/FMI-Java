package hw1.Zad2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        if (previousClosingPrice <= 0.0) {
            this.previousClosingPrice = 100.0;
        }
        else {
            this.previousClosingPrice = previousClosingPrice;
        }
    }

    public void setCurrentPrice(double currentPrice) {
        if (currentPrice <= 0.0) {
            this.currentPrice = 10.0;
        }
        else {
            this.currentPrice = currentPrice;
        }
    }

    double changePercent() {
        return (currentPrice / previousClosingPrice) * 100;
    }
}

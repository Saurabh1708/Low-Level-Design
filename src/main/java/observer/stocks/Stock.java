package observer.stocks;

public class Stock {
    private Double price;
    private String symbol;
    private String name;

    Stock(Double price, String symbol, String name) {
        this.price = price;
        this.symbol = symbol;
        this.name = name;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getSymbol(){
        return this.symbol;
    }
    public String getName(){
        return this.name;
    }

    public void setPrice(Double price){
        this.price = price;
    }
}

package observer.stocks;

import java.util.HashMap;
import java.util.Map;

public class PriceDisplay implements IObserver {
    // map of symbol vs price
    Map<String, Double> mapOfStocks;

    PriceDisplay(){
        mapOfStocks=new HashMap<>();
    }

    public void update(Stock stock) {
        // fetch the fresh price of the stock whose price is updated
        double updatedPrice= stock.getPrice();
        mapOfStocks.put(stock.getSymbol(),updatedPrice);
        System.out.println("Stock price of "+ stock.getName() +" is: " + updatedPrice);
    }

    public Map<String, Double> getStocks() {
        return mapOfStocks;
    }

    public void addStockToDisplay(Stock stock){
        mapOfStocks.put(stock.getSymbol(),stock.getPrice());
    }

    public Double getPrice(Stock stock){
        return mapOfStocks.get(stock.getSymbol());
    }
}

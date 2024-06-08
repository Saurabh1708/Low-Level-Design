package observer.stocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//observable
public class StockMarket {
    Map<String, Stock> stocks;
    ArrayList<IObserver> observers;

    StockMarket(){
        stocks=new HashMap<String, Stock>();
        observers= new ArrayList<>();
    }

    public void addStock(Stock stock){
        stocks.put(stock.getSymbol(), stock);
    }

    public void addObserver(IObserver observer){
        observers.add(observer);
    }

    public void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    public void notify(Stock stock){
        for(IObserver observer:observers){
            observer.update(stock);
        }
    }

    public Map<String, Stock> getStocks(){
        return this.stocks;
    }


    public Stock getStock(Stock stock){
        return this.stocks.get(stock.getSymbol());
    }

    public void updateStockPrice(Stock stock,Double newPrice){
        stock.setPrice(newPrice);
        this.stocks.put(stock.getSymbol(), stock);
        notify(getStock(stock));
    }
}

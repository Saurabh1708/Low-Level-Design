package observer.stocks;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        PriceDisplay priceDisplay = new PriceDisplay();
        stockMarket.addObserver(priceDisplay);
        Stock hul=new Stock(100.0,"HUL","HINDUSTAN UNILELVER");
        Stock mrf=new Stock(200.0,"MRF","MRF");
        Stock nstl = new Stock(300.0,"NSTL","NESTLE");

        stockMarket.addStock(hul);
        stockMarket.addStock(mrf);
        stockMarket.addStock(nstl);

        priceDisplay.addStockToDisplay(hul);
        priceDisplay.addStockToDisplay(mrf);
        priceDisplay.addStockToDisplay(nstl);

        stockMarket.updateStockPrice(nstl,150.0);
        stockMarket.updateStockPrice(hul,250.0);

    }
}

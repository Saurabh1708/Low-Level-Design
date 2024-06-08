package strategy.sales.sales;

import strategy.sales.Model.IDiscountStrategy;
import strategy.sales.Model.Sale;

public class BlackFridaySale extends Sale {
    public BlackFridaySale(IDiscountStrategy discountStrategy){
        super(discountStrategy);
    }
}



package strategy.sales.sales;

import strategy.sales.Model.IDiscountStrategy;
import strategy.sales.Model.Sale;

public class PrimeDaySale extends Sale {
    public PrimeDaySale(IDiscountStrategy discountStrategy){
        super(discountStrategy);
    }
}

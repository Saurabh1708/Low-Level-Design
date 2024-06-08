package org.sales.sales;

import org.sales.Model.IDiscountStrategy;
import org.sales.Model.Sale;

public class BlackFridaySale extends Sale {
    public BlackFridaySale(IDiscountStrategy discountStrategy){
        super(discountStrategy);
    }
}



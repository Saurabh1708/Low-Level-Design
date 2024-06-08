package org.example.sales;

import org.example.Model.IDiscountStrategy;
import org.example.Model.Sale;

public class BlackFridaySale extends Sale {
    public BlackFridaySale(IDiscountStrategy discountStrategy){
        super(discountStrategy);
    }
}



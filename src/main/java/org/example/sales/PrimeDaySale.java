package org.example.sales;

import org.example.Model.IDiscountStrategy;
import org.example.Model.Sale;

public class PrimeDaySale extends Sale {
    public PrimeDaySale(IDiscountStrategy discountStrategy){
        super(discountStrategy);
    }
}

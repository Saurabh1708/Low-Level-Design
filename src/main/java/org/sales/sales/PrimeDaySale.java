package org.sales.sales;

import org.sales.Model.IDiscountStrategy;
import org.sales.Model.Sale;

public class PrimeDaySale extends Sale {
    public PrimeDaySale(IDiscountStrategy discountStrategy){
        super(discountStrategy);
    }
}

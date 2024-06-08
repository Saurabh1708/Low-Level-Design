package org.example.discount_strategy;

import org.example.Model.IDiscountStrategy;
import org.example.Model.Product;

import java.util.ArrayList;

public class FiftyPercentOffDiscountStrategy implements IDiscountStrategy {
    public Double calculateTotalDiscount(ArrayList<Product> products){
        double totalDiscount=0;

        for (Product product : products) {
            totalDiscount += product.getProductPrice() / 2;
        }

        return totalDiscount;
    }
}

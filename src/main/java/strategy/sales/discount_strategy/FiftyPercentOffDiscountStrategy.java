package strategy.sales.discount_strategy;

import strategy.sales.Model.IDiscountStrategy;
import strategy.sales.Model.Product;

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

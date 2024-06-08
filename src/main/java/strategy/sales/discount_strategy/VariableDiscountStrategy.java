package strategy.sales.discount_strategy;

import strategy.sales.Model.IDiscountStrategy;
import strategy.sales.Model.Product;

import java.util.ArrayList;

public class VariableDiscountStrategy implements IDiscountStrategy {

    private double discountPerc;

    public VariableDiscountStrategy(double discount){
        this.discountPerc=discount;
    }

    public Double calculateTotalDiscount(ArrayList<Product> products){
        double discountedPrice=0.0;

        for(Product product : products){
            discountedPrice+=product.getProductPrice()*(1-(this.discountPerc/100));
        }
        return discountedPrice;
    }
}

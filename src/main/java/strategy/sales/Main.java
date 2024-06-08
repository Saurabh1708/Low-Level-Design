package strategy.sales;

import strategy.sales.discount_strategy.FiftyPercentOffDiscountStrategy;
import strategy.sales.discount_strategy.VariableDiscountStrategy;
import strategy.sales.sales.BlackFridaySale;
import strategy.sales.sales.PrimeDaySale;
import strategy.sales.Model.Product;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        BlackFridaySale bf_sale =  new BlackFridaySale(new FiftyPercentOffDiscountStrategy());
        bf_sale.getCart().addProduct(new Product("p1",200.0));
        bf_sale.getCart().addProduct(new Product("p2",200.0));
        bf_sale.getCart().addProduct(new Product("p3",300.0));
        bf_sale.getCart().addProduct(new Product("p4",100.0));

        System.out.println("Total discount for Black Friday sale is " + bf_sale.getTotalDiscount());

        PrimeDaySale pd_sale= new PrimeDaySale(new VariableDiscountStrategy(10));

        pd_sale.getCart().addProduct(new Product("vp1",200.0));
        pd_sale.getCart().addProduct(new Product("vp1",200.0));
        pd_sale.getCart().addProduct(new Product("vp1",200.0));

        System.out.println("Total discount for Prime day sale is " + pd_sale.getTotalDiscount());

    }


}
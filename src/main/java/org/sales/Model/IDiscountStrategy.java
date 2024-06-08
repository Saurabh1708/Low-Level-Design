package org.sales.Model;

import java.util.ArrayList;

public interface IDiscountStrategy {
     public Double calculateTotalDiscount(ArrayList<Product> products);
}

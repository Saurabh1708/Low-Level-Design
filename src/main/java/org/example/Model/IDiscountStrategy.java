package org.example.Model;

import java.util.ArrayList;

public interface IDiscountStrategy {
     public Double calculateTotalDiscount(ArrayList<Product> products);
}

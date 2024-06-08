package org.sales.Model;

public class Product {
    private String productName;
    private Double productPrice;

    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Double getProductPrice(){
        return this.productPrice;
    }

    public String getProductName(){
        return this.productName;
    }
}

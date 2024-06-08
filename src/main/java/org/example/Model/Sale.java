package org.example.Model;

public class Sale {

    private IDiscountStrategy discountStrategy;
    private Cart cart;

    public Sale(IDiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
        this.cart = new Cart();
    }

    public void setDiscountStrategy(IDiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public Double getTotalDiscount(){
        return this.discountStrategy.calculateTotalDiscount(this.cart.getProducts());
    }

    public Cart getCart(){
        return this.cart;
    }
}

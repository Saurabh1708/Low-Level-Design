package strategy.sales.Model;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;


    public Cart(){
        this.products= new ArrayList<Product>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }

}

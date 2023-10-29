package ecommerce;

import java.util.ArrayList;

public class ShoppingCart{

    private ArrayList<Product> product = new ArrayList<>();
    // Public Methods
    //adds a single object of the product to the cart
    public void addProduct(Product addProduct){
        product.add(addProduct);
    }
    public void removeProduct(Product removeProduct){
        product.remove(removeProduct);
    }

    // returns true if product is in cart already, false otherwise
    public boolean hasProduct(Product aProduct){
        for(int i = 0; i< getCartSize(); i++){
            if(aProduct == product.get(i)){
                return true;
            }
        }
        return false;
    }

    //returns the total retail cost of the products in the cart, including tax
    public double totalCartPrice(){
        double totalPrice = 0;
        for(int i = 0; i<getCartSize(); i++){
            totalPrice += product.get(i).getRetailPrice();
        }
        return totalPrice;
    }

    //returns the total retail cost of products in the cart without tax
    public double beforeTaxPrice(){
        double totalPrice = 0;
        totalPrice = totalCartPrice() / (1 + Product.getTaxRate());
        return totalPrice;
    }

    // returns the total cost of the products in the cart, including tax, empties the cart 
    public double checkout(){
        double totalPrice = totalCartPrice();
        product.clear();
        return totalPrice; 
    }

    // returns the number of items in the cart
    public int getCartSize(){
        return product.size();
    }

    /* returns a single String that contains every item in the cart, each on its own line. 
    Product lines must be the same format as specified in the Product toString() method.
    */
    @Override
    public String toString(){
        StringBuilder itemList = new StringBuilder();
        for(Product index: product){
            itemList.append(index + "\n");
        }
        return itemList.toString();
    }
}
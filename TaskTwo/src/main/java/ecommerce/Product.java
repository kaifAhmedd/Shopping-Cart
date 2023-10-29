package ecommerce;

import java.text.DecimalFormat;

public class Product{
    private int id;
    private String productName;
    private Double costOfProduct;
    private static double theTaxRate = 0.13;
    private Double theMarkUp = 0.25;

    // Package Private methods
    void setProductId(int productId){
        id = productId;
    } 
    void setName(String name){
        productName = name;
    } 
    void setCost(Double cost){
        if(cost<0){
            costOfProduct = 0.0;
        }else{
            costOfProduct = cost;
        }
    }

    // returns the wholesale cost of the item
    double getCost(){
        return costOfProduct;
    } 

    /* parameter is between 0 and 1.
    values outside this range should be ignored and a default 
    value of .13 used */
    static void setTaxRate(double taxRate){
        if(taxRate>0 && taxRate<1){
            theTaxRate = taxRate;
        }
    }
    
    /* parameter is between 0 and 1.
    values outside this range should be ignored and a default 
    value of .25 used */
    void setMarkUp(Double markUp){
        if(markUp>0 && markUp<1){
            theMarkUp = markUp;
        }
    }
    
    // public methods
    public int getProductId(){
        return id;
    } 
    public String getName(){
        return productName;
    }

    /*returns the retail price for the item
    retail price = (wholesaleCost * (1 + markup)) * (1 + taxRate)
    */
    public double getRetailPrice(){
        double retailPrice;
        retailPrice = (getCost() * (1 + getMarkupRate())) * (1 + getTaxRate());
        return retailPrice;
    }

    //returns the markup as a decimal between 0 and 1
    public double getMarkupRate(){
        return theMarkUp;
    }

    //returns a string consisting of the item name, 
    //a colon, a space, and the retail price of the 
    //item rounded up to 2 decimal spots
    @Override
    public String toString(){
        DecimalFormat rounder = new DecimalFormat("0.00");
        String itemNameAndRetailPrice = "";
        itemNameAndRetailPrice = getName() + ": " + rounder.format(getRetailPrice());
        return itemNameAndRetailPrice;
    }

    //static method to return the tax rate
    //returns the tax rate as a decimal between 0 and 1 
    public static double getTaxRate(){
        return theTaxRate;
    }
}
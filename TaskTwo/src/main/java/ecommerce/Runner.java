package ecommerce;

public class Runner{
    public static void main(String[] args){
        Product toothbrush = new Product();
        Product comb = new Product();
        Product manga = new Product();
        Product iPhone = new Product();
        Product calogne = new Product();
        Product laptop = new Product();

        ShoppingCart cart = new ShoppingCart();

        cart.removeProduct(laptop);

        int id = 0001;
        String name = "Toothbrush"; 
        Double cost = 2.99;
        toothbrush.setProductId(id);
        toothbrush.setName(name);
        toothbrush.setCost(cost);
        cart.addProduct(toothbrush);
        System.out.println("Item #1");
        System.out.println("The ID of the product is: " + toothbrush.getProductId());
        System.out.println("The name of the product is: " + toothbrush.getName());
        System.out.println("The cost of the product is: " + toothbrush.getCost());
        Double markRate = 0.50;
        toothbrush.setMarkUp(markRate);
        System.out.println("The markup rate for item is: " + toothbrush.getMarkupRate());
        System.out.println("Retail price of item is: " + toothbrush.getRetailPrice());
        String details = toothbrush.toString();
        System.out.println("name and retail price of item are: " + details);

        id = 0002;
        name = "Comb"; 
        cost = 3.00;
        comb.setProductId(id);
        comb.setName(name);
        comb.setCost(cost);
        cart.addProduct(comb);
        System.out.println("Item #2");
        System.out.println("The ID of the product is: " + comb.getProductId());
        System.out.println("The name of the product is: " + comb.getName());
        System.out.println("The cost of the product is: " + comb.getCost());
        markRate = 2.30;
        comb.setMarkUp(markRate);
        System.out.println("The markup rate for item is: " + comb.getMarkupRate());
        System.out.println("Retail price of item is: " + comb.getRetailPrice());
        details = comb.toString();
        System.out.println("name and retail price of item are: " + details);

        id = 0003;
        name = "Manga"; 
        cost = 13.99;
        manga.setProductId(id);
        manga.setName(name);
        manga.setCost(cost);
        cart.addProduct(manga);
        System.out.println("Item #3");
        System.out.println("The ID of the product is: " + manga.getProductId());
        System.out.println("The name of the product is: " + manga.getName());
        System.out.println("The cost of the product is: " + manga.getCost());
        markRate = 0.65;
        manga.setMarkUp(markRate);
        System.out.println("The markup rate for item is: " + manga.getMarkupRate());
        System.out.println("Retail price of item is: " + manga.getRetailPrice());
        details = manga.toString();
        System.out.println("name and retail price of item are: " + details);

        id = 0004;
        name = "IPhone"; 
        cost = 600.99;
        iPhone.setProductId(id);
        iPhone.setName(name);
        iPhone.setCost(cost);
        cart.addProduct(iPhone);
        System.out.println("Item #4");
        System.out.println("The ID of the product is: " + iPhone.getProductId());
        System.out.println("The name of the product is: " + iPhone.getName());
        System.out.println("The cost of the product is: " + iPhone.getCost());
        markRate = 1.32;
        iPhone.setMarkUp(markRate);
        System.out.println("The markup rate for item is: " + iPhone.getMarkupRate());
        System.out.println("Retail price of item is: " + iPhone.getRetailPrice());
        details = iPhone.toString();
        System.out.println("name and retail price of item are: " + details);

        id = 0005;
        name = "Calogne"; 
        cost = 169.65;
        calogne.setProductId(id);
        calogne.setName(name);
        calogne.setCost(cost);
        cart.addProduct(calogne);
        System.out.println("Item #5");
        System.out.println("The ID of the product is: " + calogne.getProductId());
        System.out.println("The name of the product is: " + calogne.getName());
        System.out.println("The cost of the product is: " + calogne.getCost());
        markRate = 0.25;
        calogne.setMarkUp(markRate);
        System.out.println("The markup rate for item is: " + calogne.getMarkupRate());
        System.out.println("Retail price of item is: " + calogne.getRetailPrice());
        details = calogne.toString();
        System.out.println("name and retail price of item are: " + details);

        System.out.println("Tax Rate Info");
        double taxRate = 1.63;
        Product.setTaxRate(taxRate);
        System.out.println("The taxRate is: " + Product.getTaxRate());
        taxRate = 1.63;
        Product.setTaxRate(taxRate);
        System.out.println("The taxRate after change is: " + Product.getTaxRate());


        boolean isAdded;
        isAdded = cart.hasProduct(comb);
        System.out.println("is this product already in the cart? " + isAdded);
        cart.removeProduct(comb);
        isAdded = cart.hasProduct(comb);
        System.out.println("is this product already in the cart? " + isAdded);

        double cartTotal = cart.totalCartPrice();
        System.out.println("The total cost of the items in the cart is: " + cartTotal);

        double beforeTax = cart.beforeTaxPrice();
        System.out.println("The total cost of the items in the cart before tax is: " + beforeTax);

        String listOfItems = cart.toString();
        System.out.println("Here are the items currently in the cart: ");
        System.out.println(listOfItems);
        int cartSize = cart.getCartSize();
        System.out.println("the size of the cart is: " + cartSize);

        double checkout = cart.checkout();
        System.out.println("You are now checking out and your total cart price with tax is: " + checkout);
        System.out.println("The cart is now cleared");
        cartSize = cart.getCartSize();
        System.out.println("The size of the cart is now: " + cartSize);

        // test cases for nothing in the cart
        cartTotal = cart.totalCartPrice();
        System.out.println("The total cost of the items in the cart is: " + cartTotal);

        beforeTax = cart.beforeTaxPrice();
        System.out.println("The total cost of the items in the cart before tax is: " + beforeTax);

        cart.hasProduct(comb);
        System.out.println("is this product already in the cart? " + isAdded);

        listOfItems = cart.toString();
        System.out.println("Here are the items currently in the cart: ");
        System.out.println(listOfItems);

        // test cases with only one thing in the cart

        id = 0001;
        name = "Toothbrush"; 
        cost = 2.99;
        toothbrush.setProductId(id);
        toothbrush.setName(name);
        toothbrush.setCost(cost);
        cart.addProduct(toothbrush);
        System.out.println("Item #1");
        System.out.println("The ID of the product is: " + toothbrush.getProductId());
        System.out.println("The name of the product is: " + toothbrush.getName());
        System.out.println("The cost of the product is: " + toothbrush.getCost());
        markRate = 0.50;
        toothbrush.setMarkUp(markRate);
        System.out.println("The markup rate for item is: " + toothbrush.getMarkupRate());
        System.out.println("Retail price of item is: " + toothbrush.getRetailPrice());
        details = toothbrush.toString();
        System.out.println("name and retail price of item are: " + details);

        cartSize = cart.getCartSize();
        System.out.println("The size of the cart is now: " + cartSize);

        cartTotal = cart.totalCartPrice();
        System.out.println("The total cost of the items in the cart is: " + cartTotal);

        beforeTax = cart.beforeTaxPrice();
        System.out.println("The total cost of the items in the cart before tax is: " + beforeTax);

        isAdded = cart.hasProduct(toothbrush);
        System.out.println("is this product already in the cart? " + isAdded);

        listOfItems = cart.toString();
        System.out.println("Here are the items currently in the cart: ");
        System.out.println(listOfItems);

    }
}
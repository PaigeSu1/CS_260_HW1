//This is the main file
/*
You only need to initiate 3 objects for ShoppingCart, and
pass in 3 different algorithms respectively
 */

public class Main {
    public static void main(String[] args){

        double originalPriceMain = 100.0;

        // If you design the NoDiscount class without constructor. So the default constructor (no parameter)
        // will be used
        ShoppingCart cart1 = new ShoppingCart(new NoDiscount());
        ShoppingCart cart2 = new ShoppingCart(new PercentageDiscount(10));
        ShoppingCart cart3 = new ShoppingCart(new FixedDiscount(20));

        System.out.println("Cart 1 Total: " + cart1.calculateTotal(originalPriceMain));
        System.out.println("Cart 2 Total: " + cart2.calculateTotal(originalPriceMain));
        System.out.println("Cart 3 Total: " + cart3.calculateTotal(originalPriceMain));

        }
    }

public class FixedDiscount implements DiscountStrategy {

    //How to Make a constructor
    //Class Variables, This will make the local copy of the variable.
    double discountAmount;


    //make a constructor
    //They will always go to the top, so they can be easy to find.
    //ClassName(data type, paramName) Prams that must be passed in
    FixedDiscount(double discountAmount){
        //This is the local copy of the variable setting it
        this.discountAmount = discountAmount;
    }


    //This is a class that is returning a double
    public double applyDiscount(double originalPrice){

        //Makes a local variable within the apply discount func.
        double newPriceAfterDiscountAmount;

        //Math to find the discount price
        newPriceAfterDiscountAmount = originalPrice - discountAmount;
        return newPriceAfterDiscountAmount;


    }


}

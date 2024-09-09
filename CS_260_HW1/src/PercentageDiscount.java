

public class PercentageDiscount implements DiscountStrategy {

    //Class Variables, This will make the local copy of the variable.
    double percentage;
    //make a constructor
    //They will always go to the top so they can be easy to find.
    PercentageDiscount(double percentage){
        this.percentage = percentage;
    }


    //This is a class that is returning a double
    public double applyDiscount(double originalPrice){

        //Makes a local variable within the apply discount func.
        double newPriceAfterDiscount;

        //Math to find the discount price
        newPriceAfterDiscount = originalPrice - (percentage / 100.0) * originalPrice;
        return newPriceAfterDiscount;


    }
}

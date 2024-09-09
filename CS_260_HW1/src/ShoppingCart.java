public class ShoppingCart {
    //How to Make a constructor
    //Class Variables, This will make the local copy of the variable.
    //Passing in a discountStrategy passed into constructor
    DiscountStrategy discountStrategyOBJ;


    //make a constructor
    //They will always go to the top, so they can be easy to find.
    //ClassName(data type, paramName) Prams that must be passed in
    ShoppingCart(DiscountStrategy discountStrategyOBJ){
        //This is the local copy of the variable setting it
        this.discountStrategyOBJ = discountStrategyOBJ;
    }


    //This is a Method (b/c its name is lower case and may return something)
    public double calculateTotal(double originalPrice){

        double returnVal;
        //method calling another method in an object passing in obj within construct
        // the obj was discountStrategy when the shopping cart was created
        returnVal = discountStrategyOBJ.applyDiscount(originalPrice);

        //return the final value
        return returnVal;
    }















}

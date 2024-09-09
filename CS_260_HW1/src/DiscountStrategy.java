/*
[DiscountStrategy]:
DiscountStrategy is just an interface, it states that all classes who want to implement me have to
implement the following function:
double applyDiscount(double originalPrice);
Since it is a double for its signature, for all the classes who implements this interface need to return a
“double” value. But for this interface, it doesn’t have an implementation here!
 */

public interface DiscountStrategy {
    public double applyDiscount(double originalPrice);

}

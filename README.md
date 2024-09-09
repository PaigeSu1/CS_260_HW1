Object-Oriented Prog. & Design – Fall 2024

HW1 Part1 Shopping Cart Simulation with Strategy Pattern                 5 pts 
===========================================================================================================
In this homework, you will practice in creating Java interface and classes to simulate an online shopping 
cart. 
In this homework, we need to develop the following: 
1) DiscountStrategy.java (interface) 
2) NoDiscount.java (Algorithm) 
3) PercentDiscount.java (Algorithm) 
4) FixedDiscount.java (Algorithm) 
5) ShoppingCart.java 
6) Main.java


[DiscountStrategy]: 


  DiscountStrategy is just an interface, it states that all classes who want to implement me have to 
  implement the following function: 
  double applyDiscount(double originalPrice);

  
  Since it is a double for its signature, for all the classes who implements this interface need to return a 
  “double” value. But for this interface, it doesn’t have an implementation here! 

[NoDiscount]: 


  Since NoDiscount class implements DiscountStrategy, for its applyDiscount(), it can just take in the 
  original price as the parameter and return the original price. Of course, do remember to use your 
  “@Override” 
  
  Constructor is optional. As you know, Java has a default constructor for customized class which is 
  doing nothing (if we do not put a constructor)

[PercentageDiscount]: 

  
  PercentageDiscount class implements DiscountStrategy. For its constructor, it needs to take in the 
  percentage, a double typed number, as a parameter and setup its local copy of the variable
  
  For its applyDiscount(), it can take in originalPrice as a parameter, then do the following: 
  originalPrice – (percentage / 100.0) * originalPrice
  
  [FixedDiscount]: 
  
  
  FixedDiscount class implements DiscountStrategy. For its constructor, it needs to take in the 
  discountAmount, a double typed number, as a parameter and setup its local copy of the variable
  
  For its applyDiscount(), it can take in originalPrice as a parameter, then do the following: 
  originalPrice – discountAmount

[ShoppingCart]: 


  This class implements nothing. It only needs to setup its local copy of DiscountStrategy in its 
  constructor.
  
  So, of course, you need to have this DiscountStrategy pass into its constructor
  
  It also has a method called calculateTotal(). You need to pass in a double typed variable as a parameter 
  called originalPrice
  
  Inside of this method, you need to drive the local copy of DiscountStrategy to call the applyDiscount() 
  by providing originalPrice. Since we need to use originalPrice, you need to pass this parameter into 
  calculateTotal()
  
  Once you get the computed final price, you can have this function--- calculateTotal(), to return the final 
  value. 

[Main] 


  You only need to initiate 3 objects for ShoppingCart, and pass in 3 different algorithms respectively
  
  Of course, you need to initiate a double variable for original price. You can put any price, for example, 
  20.0 or 100.0
  
  For how much in the discount, it is up to you. You only need to make sure the computation is correct. 
  For example:
  
  // If you design the NoDiscount class without constructor. So the default constructor (no parameter) 
  // will be used 
  ShoppingCart cart1 = new ShoppingCart(new NoDiscount()); 
  ShoppingCart cart2 = new ShoppingCart(new PercentageDiscount(10)); 
  ShoppingCart cart3 = new ShoppingCart(new FixedDiscount(20));
  
  Then, you can have the value to print out in the System.out.println by calling the calculateTotal() for 
  different shopping carts. (car1~cart3). For example, I setup a “double” variable “originalPrice” as 100.0 
  
  Here is an example of the print-out, and you can just purely to use println() 
  Cart 1 Total: [Some value is here] 
  Cart 2 Total: [Some value is here] 
  Cart 3 Total: [Some value is here]

What are the files to submit? 6 files in a Zip file! HW1Part1.zip 
       DiscountStrategy.java 
       NoDiscount.java 
       PercentageDiscount.java 
       FixedDiscount.java 
       ShoppingCart.java 
       Main.java



Object-Oriented Prog. & Design – Fall 2024
HW1 Part2 Company Structures Simulation with COMPOSITE Pattern        5 pts
==============================================================================================
In this homework, you will practice in creating Java interface and classes to simulate company 
structures

    In this homework, we need to develop the following: 
                1) Department.java (Interface) 
                2) FinancialDepartment.java (Leaf) 
                3) SalesDepartment.java (Leaf) 
                4) HRDepartment.java (Leaf) 
                5) HeadDepartment.java (Composite) 
                6) Main.java

[Department]: 
  In this interface, there is nothing to do but to define a method. printDepartmentName() 


[FinancialDepartment]: 
  This class implements the interface Department 
  There are only 2 fields. One is an “integer id”, and another is a “String name” 
  There is a constructor for this class. It takes in 2 parameters and setup its local copies of fields (variables) 
  As for the printDepartmentName(), we only need to use getClass().getSimpleName() to get the name for 
  this class. Then, we can just use the System.out.println() to print out its class name

[SalesDepartment]: 
  It is the same as above

[HRDepartment]: 
  It is the same as above 

[HeadDepartment]: 
  This class implements the interface Department 
  There are only 2 fields. One is an “integer id”, and another is a “String name” 
  
  There will be a list of Department objects, you can declare it by giving it a name in the beginning of the 
  class
  
  There is a constructor for this class.  
  It takes in 2 parameters and setup its local copies of fields (variables) 
  Also, we can initialize this list by using the “new” keyword and have it referencing to an ArrayList
  
  There is a method --- addDepartment(). It takes in a Department object as a parameter and use its 
  ArrayList object to “add” this Department object
  
  There is a method --- removeDepartment(). It takes in a Department object as a parameter and use its 
  ArrayList object to “remove” this Department object

[Main] 
  We can do the following testing: 
  We “new” 3 objects, salesDepartment, financialDepartment, and hrDepartment. They are referencing to 
  their classes but their types are the same --- “Department”! 
  We “new” 2 objects, regionalDepartment and headDepartment. They are “newed” from 
  HeadDepartment and their types are the same, “HeadDepartment”!


Then, do the following in our tests: 

  1) Use the regionalDepartment object (Composite) to add departments by calling addDepartment() 
  We add financialDepartment, salesDepartment, and hrDepartment (leaves) into 
  regionalDepartment

  2) Use the headDepartment object (Composite) to add regionalDepartment (Composite) by calling 
  addDepartment()

  3) Use the headDepartment object to call printDepartmentName(). Let’s see if the following will be 
  printed out?

  4) The rule is, in your pattern of the Java code, 3 departments are allowed to be printed (I don’t 
  really care about the order). You cannot print the regional department because it is not 
  necessary.

    What are the files to submit? 6 files in a Zip file! HW1Part2.zip 
                     Department.java (Interface) 
                     FinancialDepartment.java (Leaf) 
                     SalesDepartment.java (Leaf) 
                     HRDepartment.java (Leaf) 
                     HeadDepartment.java (Composite) 
                     Main.java (client)
      





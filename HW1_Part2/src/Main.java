// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creating 3 new objects for sales, financial, and hr departments
        Department salesDepartment = new SalesDepartment(1, "Sales Department");
        Department financialDepartment = new FinancialDepartment(2, "Financial Department");
        Department hrDepartment = new HRDepartment(3, "HR Department");


        //Test 1
        /*
        Use the regionalDepartment object (Composite) to add departments by calling addDepartment()
        We add financialDepartment, salesDepartment, and hrDepartment (leaves) into
        regionalDepartment
         */

        //Creating an object called regional Department, of the type HeadDepartment
        HeadDepartment regionalDepartment = new HeadDepartment(4, "Regional Department");
        //Inside the HeadDepartment for regionalDepartment Im add a sub department in to the
        //regionalDepartment object (Adding it its own copy to the Arraylist)
        regionalDepartment.addDepartment(salesDepartment);
        regionalDepartment.addDepartment(financialDepartment);
        regionalDepartment.addDepartment(hrDepartment);



        //Test 2
        /*
        Use the headDepartment object (Composite) to add regionalDepartment (Composite) by calling
        addDepartment()
         */

        //Created a new headDepartment named regionalDepartment (which is an obj)
        HeadDepartment headDepartment = new HeadDepartment(5, "Head Department");
        headDepartment.addDepartment(regionalDepartment);


        //Test 3
        /*
        Use the headDepartment object to call printDepartmentName(). Let’s see if the following will be
        printed out?
         */

        //calls the HeadDepartment Object and uses the printDepartmentName functions
        //for each department
        headDepartment.printDepartmentName();

    }

}


        /*
        //Old version that printed an array list out but also include the location in
        //memory to be printed out with it.


        //Create 3 new objects to make the program be in a run in the main
        SalesDepartment department1 = new SalesDepartment(1234, "BobSales");
        FinancialDepartment department2 = new FinancialDepartment(9876, "AvaMoney");
        HRDepartment department3 = new HRDepartment(3698, "JillHuman");

        //Creating newed departments with the type being Head department
        HeadDepartment headDepartment = new HeadDepartment(4354, "PaigeCEO");
        HeadDepartment regionalDepartment = new HeadDepartment(5874, "ReyRegional");

        //Testing Statements to print out the program
        //____________________________________________________________________________
        //Not working part of the Program

        //Test 1
        //Adding sales, finance and HR into the regionalDepartment Object
        headDepartment.addDepartment(regionalDepartment);


        regionalDepartment.addDepartment(department1);
        regionalDepartment.addDepartment(department2);
        regionalDepartment.addDepartment(department3);

        //Test 2
        //Layer object that are in with each other
        headDepartment.addDepartment(regionalDepartment);


        //Test 3
        //Use Department obj to call the method and hope something's prints out
        System.out.println(regionalDepartment.departmentList.toString());
        //System.out.println(headDepartment.departmentList.get(0).);
        */






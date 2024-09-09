//This is a leaf
public class SalesDepartment implements Department{
    //Class Variables Set up
    private Integer id;
    private String name;


    //Make a constructor for the Class
    //Constructors are the same name as the classes
    SalesDepartment(Integer id, String name){
        //Sets up the local copies
        this.id = id;
        this.name = name;
    }

    //Create a method called printDepartmentName
    @Override
    public void printDepartmentName(){
        //this means is part of this class that comes with it
        // is optional but will help when learning how to code it
        System.out.println(this.getClass().getSimpleName());
    }
}

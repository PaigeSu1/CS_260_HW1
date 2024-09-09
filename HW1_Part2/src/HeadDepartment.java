import java.util.ArrayList;
import java.util.List;

//The initialization of the Array List was the main item that was causing all the problems
public class HeadDepartment implements Department{
    //Class Variables Set up
    private Integer id;
    private String name;
    private List<Department> departments; //NEED TO HAVE THiS

    //How to make a list of Department OBJECTS
    //list in lower case is the name of the list for the array that you are making
    //Make is a good named list
    //This is also a variable things so put it at the top
    //public List<Department> departmentList = new ArrayList<Department>();
    //This arraylist only takes objects that are the type of Department



    //Make a constructor for the class
    //This will be the same name as the file (Sets up the local copies)
    public HeadDepartment(int id, String name){
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<>();
    }


    //ADD
    public void addDepartment(Department department){
        //Taking the department obj that been passed in and adding,
        //to the department list, adding to the list name on line 11.
        //How to add things to an array list {Department object being added to department-list
        departments.add(department);
    }

    //Remove
    public void removeDepartment(Department department){
        departments.remove(department);
    }

    //Print the name of the Department Method
    @Override
    public void printDepartmentName(){
        //System.out.println(this.departmentList.toString());  //possible problems
        //System.out.println(this.getClass().getSimpleName());  //test

        for(Department department : departments){
            department.printDepartmentName();
        }

    }

}

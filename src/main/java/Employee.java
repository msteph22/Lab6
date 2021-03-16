//Created by: msteph22
// 3/16/21

//Write a class named Employee
public class Employee {
    //following fields
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //following constructors
    //A constructor that accepts the following values as arguments and assigns 
    //them to the appropriate fields: employee's name, employee's ID number, department, and position
    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    
    //A no-arg constructor that assigns empty strings ("") to the name, department,
    //and position fields, and 0 to the idNumber field;
    public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    } 
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public int getIdNumber(){
        return idNumber;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
}

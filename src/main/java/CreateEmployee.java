//Created by: msteph22
// 3/16/21

public class CreateEmployee {
    public static void main(String[] args) {
        //Create Objects
        Employee empOne = new Employee();
        Employee empTwo = new Employee();
        Employee empThree = new Employee();
        
        //Set values inside objects
        empOne.setName("Susan Meyers");
        empOne.setIdNumber(47899);
        empOne.setDepartment("Accounting");
        empOne.setPosition("Vice President");
        
        empTwo.setName("Mark Jones");
        empTwo.setIdNumber(39119);
        empTwo.setDepartment("IT");
        empTwo.setPosition("Programmer");
        
        empThree.setName("Joy Rogers");
        empThree.setIdNumber(81774);
        empThree.setDepartment("Manufacturing");
        empThree.setPosition("Engineer");
        
        //Display Objects
        
        System.out.println("Name: " + empOne.getName());
        System.out.println("ID: " + empOne.getIdNumber());
        System.out.println("Department: " + empOne.getDepartment());
        System.out.println("Position: " + empOne.getPosition());
        
        System.out.println("");
        
        System.out.println("Name: " + empTwo.getName());
        System.out.println("ID: " + empTwo.getIdNumber());
        System.out.println("Department: " + empTwo.getDepartment());
        System.out.println("Position: " + empTwo.getPosition());
        
        System.out.println("");
        
        System.out.println("Name: " + empThree.getName());
        System.out.println("ID: " + empThree.getIdNumber());
        System.out.println("Department: " + empThree.getDepartment());
        System.out.println("Position: " + empThree.getPosition());
    }
}

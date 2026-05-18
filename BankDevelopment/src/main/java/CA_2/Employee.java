/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author aramn
 */
public class Employee {
    //Stores emplooyee first name
    private String fisrtName;
    
    //Stores emp last name
    private String lastName;
    
    //gender
    private String gender;
    
    //email address
    private String email;
    
    //Salary
    private double salary;
    
    //Dep object shows which dep employees belongs to
    private Department department;
    
    //shows manager type of employee
    private Manager manager;
    
    // Stores company name
    private String company;

    // Constructor
    // Used to create Employee object
    public Employee(String firstName,
                    String lastName,
                    String gender,
                    String email,
                    double salary,
                    Department department,
                    Manager manager,
                    String company) {

        // Save first name
        this.firstName = firstName;

        // Save last name
        this.lastName = lastName;

        // Save gender
        this.gender = gender;

        // Save email
        this.email = email;

        // Save salary
        this.salary = salary;

        // Save department object
        this.department = department;

        // Save manager object
        this.manager = manager;

        // Save company name
        this.company = company;
    }

    // Returns first name
    public String getFirstName() {
        return firstName;
    }

    // Returns manager object
    public Manager getManager() {
        return manager;
    }

    // Returns department object
    public Department getDepartment() {
        return department;
    }

    // toString method
    // Automatically runs when object is printed
    @Override
    public String toString() {

        // Returns employee information as text
        return firstName + " " +
               lastName + " | " +
               department.getDepartmentName() + " | " +
               manager.getManagerType() + " | " +
               company;
    }
}   
}

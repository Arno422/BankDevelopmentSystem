/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CA_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   
        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read employee data from file
        ArrayList<Employee> employees = Filemanager.readFile("App.txt");

        // Success message
        System.out.println(
                "File read successfully!");

        // Stores menu choice
        int choice = 0;

        // Menu loop
        // Runs until user exits
        while (choice != 6) {

            // Display menu
            System.out.println("\n1. SORT");
            System.out.println("2. SEARCH");
            System.out.println("3. DISPLAY ALL");
            System.out.println("4. CREATE TREE");
            System.out.println("5. ADD RECORD");
            System.out.println("6. EXIT");

            // Read menu choice
            choice = input.nextInt();

            // Menu selection
            switch (choice) {

                // SORT
                case 1:

                    // Calls merge sort
                    MergeSort.mergeSort(employees,0, employees.size() - 1);

                    System.out.println(
                            "Sorted Successfully!");

                    break;

                // SEARCH
                case 2:

                    // Clears scanner buffer
                    input.nextLine();

                    // Ask for employee name
                    System.out.println(
                            "Enter name:");

                    // Read name
                    String name =
                            input.nextLine();

                    // Perform binary search
                    int result =
                            BinarySearch.search(employees, name, 0, employees.size() - 1);

                    // Employee not found
                    if (result == -1) {

                        System.out.println(
                                "Employee not found");

                    } else {

                        // Display employee info
                        System.out.println(
                                employees.get(result));
                    }

                    break;

                // DISPLAY ALL
                case 3:

                    // Loop through all employees
                    for (Employee employee : employees) {

                        // Print employee
                        System.out.println(employee);
                    }

                    break;
                 
                 //Create tree
                case 4: 
                    
                    //create binary tree object
                    EmployeeBinaryTree tree = new EmployeeBinaryTree();
                    
                    //Insert employees into tree
                    for (Employee employee : employees){
                        tree.insert(employee);
                    }
                    //display 
                    tree.displayTree();
                    //display node count
                    System.out.println("nTotal Nodes: "+ tree.countNodes(tree.root));
                    
                    //display tree height
                    System.out.println("Tree height " + tree.getHeight(tree.root));
                    break;
                 //Add record 
                case 5:
                    //clear scanner  buffer
                    input.nextLine();
                    //Info fill out First name, last name ...
                    System.out.println("Enter first name ");
                    String firstName = input.nextLine();
                    System.out.println("Enter last name:");
                    String lastName = input.nextLine();
                    System.out.println("Enter gender:");
                    String gender = input.nextLine();
                    System.out.println("Enter email:");
                    String email = input.nextLine();
                    System.out.println("Enter salary:");
                      double salary = input.nextDouble();
                    // Clear scanner
                    input.nextLine();
                    //Department info
                    System.out.println("Enter department:");
                    String depName = input.nextLine();
                    System.out.println("Enter manager type:");
                    String managerType = input.nextLine();
                    System.out.println("Enter company:");
                    String company = input.nextLine();
                 // Create department object
               Department department =new Department(depName);

                // Create manager object
               Manager manager = new Manager(managerType);

                // Create employee object
               Employee newEmployee = new Employee(firstName,lastName,gender,email,salary, department, manager, company);

    // Add employee into list
    employees.add(newEmployee);

    // Success message
    System.out.println(
            "Employee added successfully!");

    break;
              }
            }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CA_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aramn
 */
public class Main {

    public static void main(String[] args) {
   
        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read employee data from file
        ArrayList<Employee> employees =
                FileManager.readFile("App.txt");

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
                    MergeSort.mergeSort(
                            employees,
                            0,
                            employees.size() - 1);

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
                            BinarySearch.search(
                                    employees,
                                    name,
                                    0,
                                    employees.size() - 1);

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
            }
        }
    }

    private static class FileManager {

        private static ArrayList<Employee> readFile(String apptxt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public FileManager() {
        }
    }
}
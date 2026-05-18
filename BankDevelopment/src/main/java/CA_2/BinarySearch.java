/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.util.ArrayList;

/**
 *
 * @author aramn
 */
public class BinarySearch {
    public static int search(
            ArrayList<Employee> employees, String target, int left, int right) {
        //If employee not found
        if (left > right)
            return -1;
       // Middle index
        int mid = (left + right) / 2;
       //Current emplooyee fisrtname
       String current =
                employees.get(mid).getFirstName();

        // Compare names
        int comparison =
                current.compareToIgnoreCase(target);

        // Found employee
        if (comparison == 0)
            return mid;
        //search lefgt side
        if (comparison > 0)
            return search(employees, target, left, mid -1);
          //search right side
         return search(employees, target, mid + 1, right);
    }
}
      

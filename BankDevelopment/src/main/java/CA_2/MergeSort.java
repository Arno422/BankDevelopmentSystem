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
public class MergeSort {
    // Merge sort 
    public static void mergeSort(
            ArrayList<Employee> employees,
            int left,
            int right) {

        // Checks if division is possible
        if (left < right) {
            // Finds middle index
            int mid = (left + right) / 2;

            // Sort left side
            mergeSort(employees, left, mid);

            // Sort right side
            mergeSort(employees, mid + 1, right);
            
            // Merge sorted parts
            merge(employees, left, mid, right);
        }
        }
// Combines sorted parts
    public static void merge(
            ArrayList<Employee> employees,
            int left,
            int mid,
            int right) {

        // Temporary list
        ArrayList<Employee> temp =
                new ArrayList<>();

        // Left pointer
        int i = left;

        // Right pointer
        int j = mid + 1;

        // Compare names alphabetically
        while (i <= mid && j <= right) {

            // compareToIgnoreCase
            // Used for alphabetical comparison
            if (employees.get(i)
                    .getFirstName()
                    .compareToIgnoreCase(
                            employees.get(j)
                            .getFirstName()) <= 0) {

                // Add smaller value
                temp.add(employees.get(i));

                i++;

            } else {

                temp.add(employees.get(j));

                j++;
            }
        }

        // Add remaining left side values
        while (i <= mid) {

            temp.add(employees.get(i));

            i++;
        }

        // Add remaining right side values
        while (j <= right) {

            temp.add(employees.get(j));

            j++;
        }

        // Copy sorted values back
        for (int k = 0; k < temp.size(); k++) {

            employees.set(left + k, temp.get(k));
        }
    }
}

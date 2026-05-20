/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.util.LinkedList;
import java.util.Queue;


public class EmployeeBinaryTree {
    // Root node of tree
    TreeNode root;

    // Inserts employee into binary tree
    public void insert(Employee employee) {

        // Create new node
        TreeNode newNode = new TreeNode(employee);

        // If tree is empty
        if (root == null) {

            // New node becomes root
            root = newNode;

            return;
        }

        // Queue used for level-order insertion
        Queue<TreeNode> queue =
                new LinkedList<>();

        // Add root into queue
        queue.add(root);

        // Continue until queue becomes empty
        while (!queue.isEmpty()) {

            // Remove current node
            TreeNode current = queue.poll();

            // Insert into left side first
            if (current.left == null) {

                current.left = newNode;

                return;

            } else {

                // Add left child into queue
                queue.add(current.left);
            }

            // Insert into right side
            if (current.right == null) {

                current.right = newNode;

                return;

            } else {

                // Add right child into queue
                queue.add(current.right);
            }
        }
}
  // Display tree level by level
public void displayTree() {

    // Check if tree empty
    if (root == null) {

        System.out.println(
                "Tree is empty");

        return;
    }

    // Queue for traversal
    Queue<TreeNode> queue =
            new LinkedList<>();

    // Add root
    queue.add(root);

    // Start level count
    int level = 1;

    // Continue until queue empty
    while (!queue.isEmpty()) {

        // Nodes in current level
        int size = queue.size();

        System.out.println(
                "\nLevel " + level + ":");

        // Print all nodes in current level
        for (int i = 0; i < size; i++) {

            // Remove current node
            TreeNode current =
                    queue.poll();

            // Employee object
            Employee emp =
                    current.employee;

            // Print employee info
            System.out.printf(
                    "%-20s | %-15s | %-20s%n",

                    emp.getFirstName()
                    + " "
                    + emp.getLastName(),

                    emp.getManager()
                            .getManagerType(),

                    emp.getDepartment()
                            .getDepartmentName()
            );

            // Add left child
            if (current.left != null) {

                queue.add(current.left);
            }

            // Add right child
            if (current.right != null) {

                queue.add(current.right);
            }
        }

        // Next level
        level++;
    }
}
    public int countNodes(TreeNode root) {

    // Empty node
    if (root == null) {
        return 0;
    }

    // Count current + left + right
    return 1
            + countNodes(root.left)
            + countNodes(root.right);
}
public int getHeight(TreeNode root) {

    // Empty tree
    if (root == null) {
        return 0;
    }

    // Left height
    int leftHeight =
            getHeight(root.left);

    // Right height
    int rightHeight =
            getHeight(root.right);

    // Return bigger height + 1
    return Math.max(
            leftHeight,
            rightHeight) + 1;
}
}
      
        
 

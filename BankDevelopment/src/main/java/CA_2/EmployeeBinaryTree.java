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
        TreeNode newNode =
                new TreeNode(employee);

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
// Display tree using level-order traversal
    public void displayTree() {

        // Check if tree empty
        if (root == null) {

            System.out.println("Tree is empty");

            return;
        }
        // Queue for traversal
        Queue<TreeNode> queue =
                new LinkedList<>();

        // Add root
        queue.add(root);

        System.out.println("\nEMPLOYEE HIERARCHY:");
         // Traverse tree
        while (!queue.isEmpty()) {

            // Remove current node
            TreeNode current =
                    queue.poll();

            // Print employee
            System.out.println(
                    current.employee);

            // Add left child
            if (current.left != null) {

                queue.add(current.left);
            }

            // Add right child
            if (current.right != null) {

                queue.add(current.right);
            }
        }
    }

    // Count total nodes
    public int countNodes(TreeNode node) {

        // Base case
        if (node == null) {

            return 0;
        }

        // Count recursively
        return 1
                + countNodes(node.left)
                + countNodes(node.right);
    }

    // Calculate tree height
    public int getHeight(TreeNode node) {

        // Base case
        if (node == null) {

            return 0;
        }

        // Left subtree height
        int leftHeight =
                getHeight(node.left);

        // Right subtree height
        int rightHeight =
                getHeight(node.right);

        // Return larger height
        return Math.max(
                leftHeight,
                rightHeight) + 1;
    }
}

 

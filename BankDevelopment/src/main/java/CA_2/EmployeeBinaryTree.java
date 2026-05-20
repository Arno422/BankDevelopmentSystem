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
        printTree(root, 0);
    }
    //rescutsive tree display
    private void printTree(TreeNode node, int level){
        // Check if tree empty
        if (root == null) {

            System.out.println("Tree is empty");

            return;
        }
        //print right side 
        printTree(node.right, level +1);
        
        //Spaces for tree shape
        for (int i=0; i < level; i++) {
            System.out.println("         ");
        }
         // Print employee name
            System.out.println(node.employee.getFirstName()+ " - " + node.employee.getManager().getManagerType());

    // Print left side
    printTree(node.left, level + 1);
}
}
        // Queue for traversal
        
 

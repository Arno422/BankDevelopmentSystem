/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;


public enum MenuOption {
    // Menu option for sorting employees
    SORT(1),
    // Menu option for searching employee
    SEARCH(2),

    // Menu option for adding new employee
    ADD_RECORD(3),

    // Menu option for creating binary tree
    CREATE_TREE(4),

    // Menu option for displaying all employees
    DISPLAY_ALL(5),

    // Menu option for exiting program
    EXIT(6);
    
    private int valueMenuOption(int value) {
        this.value = value;
    }

    // getter
    public int getValue() {
        return value;
    }

    // convert int → enum
    public static MenuOption fromInt(int number) {

        for (MenuOption option : MenuOption.values()) {

            if (option.value == number) {
                return option;
            }
        }

        return null;
    }
}


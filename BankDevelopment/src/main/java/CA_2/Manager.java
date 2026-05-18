/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author aramn
 */
public class Manager {
//Stored managers Head,team and leader etc
    private String managerType;
//Create manager  Object
    
    public Manager(String managerType) {
        //this-current object
        //stores parameret value inside object
        this.managerType = managerType;
    }
    
// returns manager type
    public String getManagerType() {
        return managerType;
    }
}


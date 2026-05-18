/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author aramn
 */
public class Filemanager {
    
    // Reads employee data from txt/csv file
    public static ArrayList<Employee> readFile(String App) {
        
    //Storing remplooyee list
    ArrayList<Employee> employees =
         new ArrayList<>();
      try {

            // Opens file
            File file = new File(App);

            // Scanner used to read file
            Scanner scanner = new Scanner(file);

            // Skips first line
            // Because first line contains column titles
            scanner.nextLine();

            // Loops through all lines in file
            while (scanner.hasNextLine()) {

                // Reads one line
                String line = scanner.nextLine();

                // Splits line using comma
                String[] data = line.split(",");

                // Store values from file columns
                String firstName = data[0];
                String lastName = data[1];
                String gender = data[2];
                String email = data[3];

}
    

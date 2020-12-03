import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeDataBaseDriver {

    public static void main(String[] args) {
        Scanner scanner = null;
        EmployeeInfo Info = new EmployeeInfo();
        Covid19employee updateCovid = new Covid19employee();

        // Opening file to begin.
        try {
            File file = new File("Employee.txt");
            scanner = new Scanner(file);
            System.out.println("File successfully read!");
            System.out.println("Starting Employee Database program..." + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
            System.exit(1);
        }
        // Scanner object invoked to write to or view from employee file.
        System.out.println("Enter 1 to add Employee" + "\n" + "Enter 2 to add Covid Data" +
                "\n" + "Enter 3 to view List of Employees");
        Scanner UserInput = new Scanner(System.in);
        String number = UserInput.nextLine();

        // Adds employee to text file.
        Info.EmployeeInfoFile(number);

        // Adds employee Covid Data to text file.
        updateCovid.CovidEmployeeUpdate(number);
        // Prints Arraylist of data from text file.
        if (number.equals("3")) {
            //print list of employees from file as arraylist.
            ArrayList<Object> list = new ArrayList<Object>();
            while (scanner.hasNext()) {
                list.add(scanner.nextLine()+"\n");
            }
            System.out.println(list);;
        }

    }
}


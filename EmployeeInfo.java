import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
/*
This class stores New employee information that will add to the text file.
 */
public class EmployeeInfo {
    private String Name;
    private int DateOfEmployment;
    private String Message = "New Employee: ";


    public EmployeeInfo(){
        String Name = "";
        int DateOfEmployment= 0;
        String Message = "New Employee: ";
    }
    public EmployeeInfo(String Name,int DateOfEmployment){
        this.Name = Name;
        this.DateOfEmployment= DateOfEmployment;

    }

    public int getDateOfEmployment(){ return DateOfEmployment; }

    public String getName(){ return Name; }




    public void EmployeeInfoFile(String number) {
        if (number.equals("1")) {
            try {
                String filename = "Employee.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println("Enter name of employee and Date of Employment");
                Scanner add = new Scanner(System.in);
                String employee = Message + add.nextLine() ;
                fw.append(employee +'\n');
                fw.close();
            } catch (IOException ioe) {
                System.err.println("IOException: " + ioe.getMessage());
            }
        }
        System.out.println("The Employee was successfully added...");
    }
}

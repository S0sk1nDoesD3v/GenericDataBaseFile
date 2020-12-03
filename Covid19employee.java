import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
This class will store and add information from the user in regard to COVID - 19
 */
public class Covid19employee extends EmployeeInfo {
    private int DateTested;
    private int DateContacted;
    private int DateOfSymptoms;
    private String Message;

    public Covid19employee(){
        DateTested = 0;
        DateContacted = 0;
        DateOfSymptoms = 0;
        Message = "Covid Employee: ";
    }
    public int getDateContacted() { return DateContacted; }

    public int getDateOfSymptoms() { return DateOfSymptoms; }

    public int getDateTested() { return DateTested; }

    // this method adds covid 19 information to file
    public void CovidEmployeeUpdate(String number){
        if (number.equals("2")) {
            try {
                String filename = "Employee.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println("Do you have symptoms?");
                Scanner covid = new Scanner(System.in);
                String employee = covid.nextLine();
                if (employee.equals("yes")) {
                    System.out.println("Enter Name, Date of testing and contact of covid");
                    Scanner add = new Scanner(System.in);
                    String Employee = Message+ add.nextLine();
                    fw.append(Employee + "\n");
                    fw.close();
                }
                else{ System.out.println("Exiting File.."); }

            } catch (IOException ioe) {
                System.err.println("IOException: " + ioe.getMessage());
            }

        }
    }

}

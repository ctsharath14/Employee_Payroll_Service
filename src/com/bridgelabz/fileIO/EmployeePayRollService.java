package com.bridgelabz.fileIO;

import java.util.ArrayList;
import java.util.Scanner;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    private static List<EmployeePayRoll> empPayRollList;
    private static Scanner sc = new Scanner(System.in);

    public EmployeePayRollService(List<EmployeePayRoll> empPayRollList) {
        this.empPayRollList = empPayRollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayRoll> empPayRollList = new ArrayList<EmployeePayRoll>();
        EmployeePayRollService empPayRollService = new EmployeePayRollService(empPayRollList);

        empPayRollService.readData();

        empPayRollService.writeData();

    }

    private static void readData() {
        System.out.println("Please Enter the following details :");
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name :");
        String name = sc.nextLine();
        System.out.println("Enter Salary :");
        double salary = sc.nextDouble();

        EmployeePayRoll empPayRollObject = new EmployeePayRoll(id, name, salary);
        empPayRollList.add(empPayRollObject);
    }

    private void writeData() {
        System.out.println("Employee Pay Roll Data : \n" + empPayRollList.get(0).toString());
    }
}*/
public class EmployeePayRollService {
    ArrayList<EmployeePayRoll> list = new ArrayList<>();
    public enum IOStream{
        CONSOLE_IO, FILE_IO, DB_IO
    }

    public static void main(String[] args) {
        IOStream ioStream = IOStream.CONSOLE_IO;
        EmployeePayRollService service = new EmployeePayRollService();
        service.readEmployeeDetails(ioStream);
        service.writeEmployeeDetails();
    }


    private void readEmployeeDetails(IOStream ioStream) {
        if(ioStream == IOStream.CONSOLE_IO){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the details");
            System.out.println("Enter employee id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name");
            String name = sc.nextLine();
            System.out.println("Enter employee salary");
            double salary = sc.nextDouble();
            list.add(new EmployeePayRoll(id, "name", salary));
        }
    }

    private void writeEmployeeDetails() {
        System.out.println("<----Console output---->");
        System.out.println(list);
    }
}

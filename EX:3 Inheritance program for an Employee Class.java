import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    double basicSalary;
    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
}
class Salary extends Employee {
    double DA, HRA, PF, grossSalary, netSalary;

    void calculateSalary() {
        DA = basicSalary * 0.40;
        HRA = basicSalary * 0.20;
        PF = basicSalary * 0.12;

        grossSalary = basicSalary + DA + HRA;
        netSalary = grossSalary - PF;
    }
    void display() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("DA            : " + DA);
        System.out.println("HRA           : " + HRA);
        System.out.println("PF            : " + PF);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Net Salary    : " + netSalary);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.getEmployeeDetails();
        s.calculateSalary();
        s.display();
    }
}

Output :
Enter Employee ID: 101
Enter Employee Name: Keerthana
Enter Basic Salary: 30000
----- Employee Details -----
Employee ID   : 101
Employee Name : Keerthana
Basic Salary  : 30000.0
DA            : 12000.0
HRA           : 6000.0
PF            : 3600.0
Gross Salary  : 48000.0
Net Salary    : 44400.0

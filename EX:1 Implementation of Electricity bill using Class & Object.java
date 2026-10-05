import java.util.Scanner;

public class ElectBill {
    public static void main(String[] args) {
        Consumer ob = new Consumer();
        ob.getData();
        ob.calc();
        ob.display();
    }
}

class Consumer {
    Scanner sc = new Scanner(System.in);

    int cno;
    String cname, typeOfConn;
    double preReading, currReading, unitConsumed, totalBill;

    void getData() {
        System.out.print("Enter Consumer Number: ");
        cno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        cname = sc.nextLine();

        System.out.print("Enter Type of Connection (domestic/commercial): ");
        typeOfConn = sc.nextLine().toLowerCase();

        System.out.print("Enter Previous Month Reading: ");
        preReading = sc.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        currReading = sc.nextDouble();

        unitConsumed = currReading - preReading;
    }

    void calc() {
        if (typeOfConn.equals("domestic")) {
            if (unitConsumed <= 100)
                totalBill = unitConsumed * 1;
            else if (unitConsumed <= 200)
                totalBill = unitConsumed * 2.5;
            else if (unitConsumed <= 500)
                totalBill = unitConsumed * 4;
            else
                totalBill = unitConsumed * 6;
        } else if (typeOfConn.equals("commercial")) {
            if (unitConsumed <= 100)
                totalBill = unitConsumed * 2;
            else if (unitConsumed <= 200)
                totalBill = unitConsumed * 4.5;
            else if (unitConsumed <= 500)
                totalBill = unitConsumed * 6;
            else
                totalBill = unitConsumed * 7;
        } else {
            System.out.println("Invalid Connection Type!");
        }
    }

    void display() {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Number : " + cno);
        System.out.println("Consumer Name   : " + cname);
        System.out.println("Connection Type : " + typeOfConn);
        System.out.println("Units Consumed  : " + unitConsumed);
        System.out.println("Total Bill      : Rs. " + totalBill);
    }
}

Output:

Enter Consumer Number: 102
Enter Consumer Name: Raghav
Enter Type of Connection (domestic/commercial): domestic
Enter Previous Month Reading: 150
Enter Current Month Reading: 800

----- Electricity Bill -----
Consumer Number : 102
Consumer Name   : Raghav
Connection Type : domestic
Units Consumed  : 650.0
Total Bill      : Rs. 3900.0

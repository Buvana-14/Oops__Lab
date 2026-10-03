import java.util.Scanner;

public class ElectBill
{
    public static void main(String[] args)
    {
        Consumer ob = new Consumer();

        ob.Getdata();
        ob.Calc();
        ob.Display();
    }
}

class Consumer
{
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);

    int cno;
    String cname, type_of_conn;
    double pre_reading, curr_reading, unit_consumed, bill;

    void Getdata()
    {
        System.out.print("\n\tEnter Consumer number = ");
        cno = in.nextInt();

        System.out.print("\n\tEnter Consumer name = ");
        cname = ins.nextLine();

        System.out.print("\n\tEnter the type of connection = ");
        type_of_conn = ins.nextLine();

        System.out.print("\n\tEnter pre_month reading = ");
        pre_reading = in.nextDouble();

        System.out.print("\n\tEnter current_month reading = ");
        curr_reading = in.nextDouble();
    }

    void Calc()
    {
        unit_consumed = curr_reading - pre_reading;

        if(type_of_conn.contains("domestic"))
        {
            if(unit_consumed <= 100)
                bill = 1 * unit_consumed;

            else if(unit_consumed > 100 && unit_consumed <= 200)
                bill = 2.50 * unit_consumed;

            else if(unit_consumed > 200 && unit_consumed <= 500)
                bill = 4 * unit_consumed;

            else
                bill = 6 * unit_consumed;
        }

        else if(type_of_conn.contains("commercial"))
        {
            if(unit_consumed <= 100)
                bill = 2 * unit_consumed;

            else if(unit_consumed > 100 && unit_consumed <= 200)
                bill = 4.50 * unit_consumed;

            else if(unit_consumed > 200 && unit_consumed <= 500)
                bill = 6 * unit_consumed;

            else
                bill = 7 * unit_consumed;
        }
    }

    void Display()
    {
        System.out.println("\n\tCustomer name = " + cname);
        System.out.println("\n\tTotal units = " + unit_consumed);
        System.out.println("\n\tTotal bill = Rs " + bill);
    }
}

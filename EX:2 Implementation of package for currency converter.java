import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code");
        System.out.println("1 : Currency");
        System.out.println("2 : Distance");
        System.out.println("3 : Time");

        int code = sc.nextInt();

        if (code == 1)
        {
            System.out.println("Enter the Currency code");
            System.out.println("1 : Euro");
            System.out.println("2 : Dollar");
            System.out.println("3 : Yen");

            int choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter amount in Rupees: ");
                double rupee = sc.nextDouble();

                double euro = rupee / 80;
                System.out.println("Euro : " + euro);

                System.out.print("Enter amount in Euro: ");
                euro = sc.nextDouble();

                rupee = euro * 80;
                System.out.println("Rupees : " + rupee);
            }
            else if (choice == 2)
            {
                System.out.print("Enter amount in Rupees: ");
                double rupee = sc.nextDouble();

                double dollar = rupee / 66;
                System.out.println("Dollar : " + dollar);

                System.out.print("Enter amount in Dollar: ");
                dollar = sc.nextDouble();

                rupee = dollar * 66;
                System.out.println("Rupees : " + rupee);
            }
            else if (choice == 3)
            {
                System.out.print("Enter amount in Rupees: ");
                double rupee = sc.nextDouble();

                double yen = rupee / 0.61;
                System.out.println("Yen : " + yen);

                System.out.print("Enter amount in Yen: ");
                yen = sc.nextDouble();

                rupee = yen * 0.61;
                System.out.println("Rupees : " + rupee);
            }
            else
            {
                System.out.println("Invalid Currency Code");
            }
        }

        else if (code == 2)
        {
            System.out.println("Enter the Distance code");
            System.out.println("1 : Meter");
            System.out.println("2 : Miles");

            int choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter the meter: ");
                double meter = sc.nextDouble();

                double km = meter * 0.001;
                System.out.println("Kilometer : " + km);

                System.out.print("Enter the Kilometer: ");
                km = sc.nextDouble();

                meter = km / 0.001;
                System.out.println("Meter : " + meter);
            }
            else if (choice == 2)
            {
                System.out.print("Enter the miles: ");
                double miles = sc.nextDouble();

                double km = miles * 1.6093;
                System.out.println("Kilometer : " + km);

                System.out.print("Enter the Kilometer: ");
                km = sc.nextDouble();

                miles = km / 1.6093;
                System.out.println("Miles : " + miles);
            }
            else
            {
                System.out.println("Invalid Distance Code");
            }
        }

        else if (code == 3)
        {
            System.out.println("Enter the Time code");
            System.out.println("1 : Minutes");
            System.out.println("2 : Seconds");

            int choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter the Hour: ");
                double hour = sc.nextDouble();

                double minute = hour * 60;
                System.out.println("Minutes : " + minute);

                System.out.print("Enter the Minute: ");
                minute = sc.nextDouble();

                hour = minute / 60;
                System.out.println("Hours : " + hour);
            }
            else if (choice == 2)
            {
                System.out.print("Enter the Hour: ");
                double hour = sc.nextDouble();

                double second = hour * 3600;
                System.out.println("Seconds : " + second);

                System.out.print("Enter the Seconds: ");
                second = sc.nextDouble();

                hour = second / 3600;
                System.out.println("Hours : " + hour);
            }
            else
            {
                System.out.println("Invalid Time Code");
            }
        }

        else
        {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}

OUTPUT:

Enter the code
1 : Currency
2 : Distance
3 : Time
1
Enter the Currency code
1 : Euro
2 : Dollar
3 : Yen
2
Enter amount in Rupees: 6600
Dollar : 100.0
Enter amount in Dollar: 6
Rupees : 396.0

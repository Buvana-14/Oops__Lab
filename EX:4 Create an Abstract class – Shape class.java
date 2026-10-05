import java.util.Scanner;
abstract class Shape {
    abstract void printArea();
}
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void printArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}
public class Program4_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle(length, breadth);
        r.printArea();

        System.out.print("Enter Base: ");
        double base = sc.nextDouble();

        System.out.print("Enter Height: ");
        double height = sc.nextDouble();

        Triangle t = new Triangle(base, height);
        t.printArea();

        sc.close();
    }
}

Output:
Enter Length: 10
Enter Breadth: 5
Area of Rectangle = 50.0

Enter Base: 8
Enter Height: 6
Area of Triangle = 24.0

import java.util.Random;

class Even implements Runnable {
    int x;

    Even(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println(
            "New Thread " + x +
            " is EVEN and Square of " + x +
            " is: " + (x * x)
        );
    }
}

class Odd implements Runnable {
    int x;

    Odd(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println(
            "New Thread " + x +
            " is ODD and Cube of " + x +
            " is: " + (x * x * x)
        );
    }
}

class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);

            System.out.println(
                "Main Thread and Generated Number is " + num
            );

            if (num % 2 == 0) {
                Thread t = new Thread(new Even(num));
                t.start();
            }
            else {
                Thread t = new Thread(new Odd(num));
                t.start();
            }

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadProgram {
    public static void main(String[] args) {
        NumberGenerator thread = new NumberGenerator();
        thread.start();
    }
}

OUTPUT

Main Thread and Generated Number is 37
New Thread 37 is ODD and Cube of 37 is: 50653
Main Thread and Generated Number is 47
New Thread 47 is ODD and Cube of 47 is: 103823
Main Thread and Generated Number is 20
New Thread 20 is EVEN and Square of 20 is: 400
Main Thread and Generated Number is 45
New Thread 45 is ODD and Cube of 45 is: 91125
Main Thread and Generated Number is 47
New Thread 47 is ODD and Cube of 47 is: 103823

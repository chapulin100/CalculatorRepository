import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        int x = 0, y = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println ("Choose an option: ");
        System.out.println ("1. Sum");
        System.out.println ("2. Substraction");
        System.out.println ("3. Multiplication");
        System.out.println ("4. Division");
        op = Integer.parseInt (sc.nextLine());


        switch (op) {
            case 1:
                System.out.println ("Give X value: ");
                x = Integer.parseInt (sc.nextLine());
                System.out.println ("Give Y value: ");
                y = Integer.parseInt (sc.nextLine());
                System.out.println ("The sum of X and Y is " + (x+y));

            case 2:
                System.out.println ("Give X value: ");
                x = Integer.parseInt (sc.nextLine());
                System.out.println ("Give Y value: ");
                y = Integer.parseInt (sc.nextLine());
                System.out.println ("The substraction of X and Y is " + (x-y));

        }


    }
}
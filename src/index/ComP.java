package index;

import java.util.Scanner;

public class ComP extends INDEX {

    public static void exit() {

        INDEX main = new INDEX();

        Scanner In = new Scanner(System.in);
        System.out.println(" END OF PROGRAM ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Do you want to continue? ");
        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);
        } else if (choice == 2) {

            System.out.println("THANK YOU !");

        } else {

            System.out.println("INVALID INPUT ");
            exit();
        }

    }

    public static void VIEW() {

        Scanner In = new Scanner(System.in);
        System.out.println("            CHOOSE TO SOLVE        ");
        System.out.println("1. PERMUTATION WITHOUT REPETITION");
        System.out.println("2. PERMUTATION WITH REPETITION");
        System.out.println("3. COMBINATION WITHOUT REPETITION");
        System.out.println("4. COMBINATION WITH REPETITION");
        System.out.print("CHOOSE NUMBER: ");
        int Menu = In.nextInt();

        PEWIOTRE choice = new PEWIOTRE();
        PEWIRE choice2 = new PEWIRE();
        COWIOURE choice3 = new  COWIOURE();
        CWP choice4 = new CWP();

        if (Menu == 1) {

            choice.WOREP();
            exit();

        } else if (Menu == 2) {

            choice2.WREP();
            exit();

        } else if (Menu == 3) {

            choice3.WOREP();
            exit();

        } else if (Menu == 4) {

            choice4.WREP();
            exit();

        } else {

            System.out.println("INVALID INPUT");
            exit();

        }
    }

}

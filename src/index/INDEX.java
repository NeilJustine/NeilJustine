package index;

import java.util.Scanner;

public class INDEX {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        System.out.println("1.COMBINATIONS AND PERMUTATIONS");
        System.out.println("2.STERLING NUMBER OF SECOND CASE");
        System.out.println("3.PASCALS'S TRIANGLE ROW GENERATOR");
        System.out.println("CHOOSE A NUMBER: ");
        try {
            int Menu = In.nextInt();

            ComP choice = new ComP();
            SterN choice2 = new SterN();
            PT choice3 = new PT();

            if (Menu == 1) {

                choice.VIEW();

            } else if (Menu == 2) {

                choice2.Sterling();

            } else if (Menu == 3) {

                choice3.Pascal();

            } else {
                System.out.println("  ");
                System.out.println("INVALID INPUT ");
                main(null);

            }
        } catch (Exception e) {

            System.out.println("          ");
            System.out.println("ACCEPT ONLY NUMERIC NUMBER");
            main(null);

        }

    }

}

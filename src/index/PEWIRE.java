
package index;

import java.math.BigInteger;
import java.util.Scanner;

public class PEWIRE extends ComP {

    public static BigInteger PWRepetition(long N, long R) {

        BigInteger PResult = new BigInteger("1");
        while (R != 0) {

            PResult = PResult.multiply(BigInteger.valueOf(N));
            System.out.println(PResult);
            R--;

        }
        System.out.println("             --Result--                   ");
        System.out.println("                                          ");
        return PResult;
    }

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

        } else {

            System.out.println("Thank You");

        }

    }

    public static void WREP() {

        Scanner In = new Scanner(System.in);

        System.out.println(" PERMUTATION WITH REPETITION");

        System.out.print("ENTER VALUE OF N: ");
        long N = In.nextLong();
        System.out.print("ENETR VALUE OF R: ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {

            System.out.println("THE VALUE OF 'R' WOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("YOU CAN INPUT NUMBER LESS THAN OR EQUAL THE LIMIT OF 500");
            exit();

        } else {

            System.out.println(" " + N + "P" + R + " WITH REPETITION IS " + PWRepetition(N, R));
            exit();

        }

    }
}

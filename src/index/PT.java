package index;

import java.math.BigInteger;
import java.util.Scanner;

public class PT extends INDEX {

    public static void Pascalloop(long N) {
        for (int U = 0; U <= N; U++) {
            int Sub = U;
            System.out.print(" " + Pascal(N, Sub) + "  ");

        }

    }

    public static BigInteger Pascal(long N, long Sub) {
        BigInteger NRResult = new BigInteger("1");
        BigInteger RResult = new BigInteger("1");
        BigInteger NMRResult = new BigInteger("1");
        BigInteger FResult;
        long c = N - Sub;
        BigInteger DResult;

        for (long i = 1; i <= N; i++) {

            NRResult = NRResult.multiply(BigInteger.valueOf(i));

        }

        for (long i = 1; i <= Sub; i++) {

            RResult = RResult.multiply(BigInteger.valueOf(i));

        }

        for (long i = 1; i <= c; i++) {

            NMRResult = NMRResult.multiply(BigInteger.valueOf(i));

        }


        DResult = RResult.multiply(NMRResult);


        FResult = NRResult.divide(DResult);

        return FResult;

    }

    public static void exit() {

        INDEX main = new INDEX();

        Scanner In = new Scanner(System.in);
        System.out.println(" END OF PROGRAM");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Do you want to continue? ");
        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);

        } else {

            System.out.println("THANK YOUS");

        }

    }

    public static void Pascal() {

        Scanner In = new Scanner(System.in);

        System.out.println(" PASCAL TRIANGLE ROW GENERATOR ");
        System.out.print("ENTER  VALUE OF N: ");
        long N = In.nextLong();

        if (N < 0) {

            System.out.println("THE VALUE OR 'R' AND 'N' IS ALWAYS POSITIVE  ");
            exit();

        } else if (N > 500) {

            System.out.println("YOU CAN INPUT NUMBER LESS THAN OR EQUAL THE LIMIT OF 500");
            exit();

        } else {

            System.out.println("THE ROW  " + N + " IS: ");
            Pascalloop(N);
            exit();

        }
    }
}

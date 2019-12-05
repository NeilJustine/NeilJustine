
package index;

import java.math.BigInteger;
import java.util.Scanner;


public class PEWIOTRE extends ComP {

    public static BigInteger Permutation(long N, long R) {
        BigInteger NRResult = new BigInteger("1");
        BigInteger NMRResult = new BigInteger("1");
        BigInteger FResult = new BigInteger("0");
        long L = N - R;


        for (long i = 1; i <= N; i++) {

            NRResult = NRResult.multiply(BigInteger.valueOf(i));

        }
        System.out.println("The Factorial of " + N + " is " + NRResult);

        for (long i = 1; i <= L; i++) {

            NMRResult = NMRResult.multiply(BigInteger.valueOf(i));
        }

        System.out.println("The N - R factoral is " + NMRResult);

        FResult = NRResult.divide(NMRResult);
        return FResult;

    }

    public static void exit() {

        INDEX main = new INDEX();

        Scanner In = new Scanner(System.in);
        System.out.println(" END OF PROGRAM  ");
        System.out.println("1. Yes");
        System.out.println("2.  No");
        System.out.print("Do you want to continue? ");
        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);

        } else {

            System.out.println("THANK YOU");
        }

    }

    public static void WOREP() {

        Scanner In = new Scanner(System.in);

        System.out.println("PERMUTATIONS WTIHOUT REPETITION");
        System.out.print("ENTER VALUE OF N : ");
        long N = In.nextLong();
        System.out.print("ENTER VALUE OF R : ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {

            System.out.println("THE VALUE OR 'R' AND 'N' IS ALWAYS POSITIVE  ");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("YOU CAN INPUT NUMBER LESS THAN OR EQUAL THE LIMIT OF 500");
            exit();
        } else if (R > N) {
            System.out.println("THE VALUE OF 'R' WOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'");
            exit();
        } else {

            System.out.println(" " + N + "  P  " + R + " IS " + Permutation(N, R));
            exit();
        }

    }
}

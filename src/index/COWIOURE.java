
package index;

import java.math.BigInteger;
import java.util.Scanner;

public class COWIOURE extends ComP {

    public static BigInteger Combination(long N, long R) {

        BigInteger NRResult = new BigInteger("1");
        BigInteger RResult = new BigInteger("1");
        BigInteger NMRResult = new BigInteger("1");
        BigInteger FResult;
        long c = N - R;
        BigInteger DResult;

        for (long i = 1; i <= N; i++) {

            NRResult = NRResult.multiply(BigInteger.valueOf(i));

        }
        
        System.out.println("THE FACTORIAL " + N + " IS " + NRResult);

        for (long i = 1; i <= R; i++) {

            RResult = RResult.multiply(BigInteger.valueOf(i));

        }
        System.out.println("THE FACTORIAL OF " + R + " IS " + RResult);
 
        for (long i = 1; i <= c; i++) {

            NMRResult = NMRResult.multiply(BigInteger.valueOf(i));
        }

        System.out.println("THE N - R FACTORIAL IS " + NMRResult);

        DResult = RResult.multiply(NMRResult);
        
        FResult = NRResult.divide(DResult);
        return FResult;

    }

    public static void exit() {

        INDEX main = new INDEX();

        Scanner In = new Scanner(System.in);
        System.out.println(" END OF PROGRAM");
        System.out.println("1. Yes");
        System.out.println("2.  No");
        System.out.print("Do you want to continue? ");
        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);

        } else {

            System.out.println("THNAK YOU");

        }

    }

    public static void WOREP() {

        Scanner In = new Scanner(System.in);
        System.out.println(" COMBINATIONS WITH REPETITION ");
        System.out.print("ENTER VALUE OF N: ");
        long N = In.nextLong();
        System.out.print("ENTER VALUE OF R: ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {

            System.out.println("THE VALUE OR 'R' AND 'N' IS ALWAYS POSITIVE ");
            exit();

        } else if (R > N) {

            System.out.println("                                   ");
            System.out.println("THE VALUE OF 'R' WOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'");
            exit();

        } else if (R > N) {

            System.out.println("                                   ");
            System.out.println("THE VALUE OF 'R' WOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("YOU CAN INPUT NUMBER LESS THAN OR EQUAL THE LIMIT OF 500");
            exit();

        } else {

            System.out.println(" " + N + "C" + R + " is " + Combination(N, R));
            exit();

        }

    }
}

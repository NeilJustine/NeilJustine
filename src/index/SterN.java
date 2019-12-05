package index;

import java.math.BigInteger;
import java.util.Scanner;

public class SterN extends INDEX {

    public static BigInteger Sterlingloop(long N, long R) {

        long Temp1 = R;
        long RLast = R;
        BigInteger Factorial = new BigInteger("1");
        BigInteger LastProcess = new BigInteger("0");
        BigInteger FinalProcess = new BigInteger("0");
        BigInteger CompareFinal = new BigInteger("0");
        BigInteger Oliburboard = new BigInteger("-1");
        for (int Sub = 0; Sub < R; Sub++) {

            FinalProcess = FinalProcess.add(SterlingSol(N, R, Sub, Temp1));

            Temp1--;
        }

        System.out.println("TOTAL SUM OF PROCESSED NUMBER : " + FinalProcess);

        for (int i = 1; i <= RLast; i++) {

            Factorial = Factorial.multiply(BigInteger.valueOf(i));

        }
        System.out.println("THE FACTORIAL OF " + R + " is " + Factorial);
        LastProcess = FinalProcess.divide(Factorial);
        if (LastProcess.compareTo(CompareFinal) < 0) {
            LastProcess = LastProcess.multiply(Oliburboard);
            return LastProcess;
        } else {
            return LastProcess;

        }
    }

    public static BigInteger SterlingSol(long N, long R, long Sub, long Temp1) {
        long NN = N;

        long T1 = Sub;

        long N2 = R;
        long R2 = 0;

        long T2 = R;
        long J = 0;
        long sub1 = T2 - Sub;

        int PWResult = 1;
        int Multiplier = -1;
        BigInteger Finalized = new BigInteger("0");

        BigInteger NRResult = new BigInteger("1");
        BigInteger RResult = new BigInteger("1");
        BigInteger NMRResult = new BigInteger("1");
        BigInteger FResult;
        long C = N2 - Sub;
        BigInteger DResult;

        BigInteger PWResult2 = new BigInteger("1");

        BigInteger Final = new BigInteger("0");
        BigInteger Final2 = new BigInteger("0");
        BigInteger VFinal = new BigInteger("0");

        System.out.println("               RESULTS           ");

        for (; T1 <= R; T1++) {

            PWResult *= Multiplier;

        }

        System.out.println("THE VALUE FOR (-1)^i is: " + PWResult);

        for (long i = 1; i <= N2; i++) {

            NRResult = NRResult.multiply(BigInteger.valueOf(i));

        }
        for (long i = 1; i <= Sub; i++) {

            RResult = RResult.multiply(BigInteger.valueOf(i));

        }
        for (long i = 1; i <= C; i++) {

            NMRResult = NMRResult.multiply(BigInteger.valueOf(i));

        }

        DResult = RResult.multiply(NMRResult);

        FResult = NRResult.divide(DResult);

        while (N != 0) {

            PWResult2 = PWResult2.multiply(BigInteger.valueOf(sub1));

            N--;

        }

        Final = FResult.multiply(BigInteger.valueOf(PWResult));
        Final2 = Final.multiply(PWResult2);

        System.out.println(N2 + "C" + Sub + " IS: " + FResult);
        System.out.println(T2 + " - " + Sub + " = " + sub1);
        System.out.println("(" + sub1 + ")^" + NN + " is: " + PWResult2);
        System.out.println("FOR  " + Sub + " LOOP IS: " + Final2);
        return Final2;
    }

    public static void exit() {

        Scanner In = new Scanner(System.in);
        System.out.println(" END OF PROGRAM  ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Do you want to continue? ");
        int choice = In.nextInt();

        if (choice == 1) {

            main(null);

        } else {

            System.out.println("THANK YOU ");

        }

    }

    public static void Sterling() {
        Scanner In = new Scanner(System.in);
        System.out.println("STERLING NUMBER Of SECOND CASE");
        System.out.print("ENTER VALUE OF N: ");
        long N = In.nextLong();
        System.out.print("ENTER VALUE OF R: ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {

            System.out.println("THE VALUE OR 'R' AND 'N' IS ALWAYS POSITIVE ");
            exit();

        } else if (R > N) {

            System.out.println("THE VALUE OF 'R' WOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'");
            exit();

        } else if (R > N) {
            
            System.out.println("THE VALUE OF 'R' WOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("YOU CAN INPUT NUMBER LESS THAN OR EQUAL THE LIMIT OF 500");
            exit();

        } else {

            System.out.println("THE STERLING " + N + " AND " + R + " IS  " + Sterlingloop(N, R));
            exit();

        }

    }

}

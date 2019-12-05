
package index;

import java.math.BigInteger;
import java.util.Scanner;

public class CWP extends ComP {
	
	public static BigInteger CWRepetition(long N,long R){
		
		long N1 = N + R -1;
		BigInteger N1Result = new BigInteger("1");
		long N2 = N - 1;
		BigInteger N2Result = new BigInteger("1");
		BigInteger RResult = new BigInteger("1");
		BigInteger FResult = new BigInteger("0");
		BigInteger FResult2 = new BigInteger("0");
		
		for(long i = 1;i<=N1;i++){
	 
			N1Result = N1Result.multiply(BigInteger.valueOf(i));
			
		}

		System.out.println("THE FACTORIAL OF N (n + r - 1) IS: "+ N1Result);

		for(long i = 1;i<=R;i++){
			
			RResult = RResult.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("THE FACTORIAL OF R: "+ RResult);
		
		
		for(long i = 1;i<=N2;i++){ 
			
			N2Result = N2Result.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println("HE FACTORIAL (N - 1) IS: "+ N2Result);
	
		FResult = RResult.multiply(N2Result);
		System.out.println("THE ANSWER IN R!(N - 1)! IS: "+FResult);
		FResult2 = N1Result.divide(FResult);
		
		return FResult2;
		
	}
	public static void exit(){
		
		INDEX main = new INDEX();
		
		Scanner In = new Scanner(System.in);
		System.out.println(" END OF PROGRAM ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.print("Do you want to continue? "); int choice = In.nextInt();


		
		if (choice == 1){
			
			main.main(null);
			
		}
		else{
			
			System.out.println("THANK YOU");
			
		}

	}
	public static void WREP(){
		
		Scanner In = new Scanner(System.in);
		
		System.out.println(" COMBINATION WIT REPETITION ");
		System.out.print("ENTER VALUE OF N: ");long N = In.nextLong();
		System.out.print("ENTER VALUE OF R: ");long R = In.nextLong();
		
		if(R < 0 || N < 0 ){
			
			System.out.println("THE VALUE OF 'R' WOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N' ");
			exit();
			
		}
		
		else if(R > 500 || N > 500){
			
			System.out.println("YOU CAN INPUT NUMBER LESS THAN OR EQUAL THE LIMIT OF 500");
			exit();
			
		}
		
		else{
			
			System.out.println(" "+ N +"C"+ R +" WITH REPETITION IS "+CWRepetition(N, R));
			exit();
			
		}
		
		
		
	}

}



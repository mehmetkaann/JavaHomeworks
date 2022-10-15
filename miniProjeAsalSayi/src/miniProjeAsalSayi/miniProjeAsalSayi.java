package miniProjeAsalSayi;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 0;
//		int[] remainders = new int[8];
//		remainders[0] = number %2;
//		remainders[1] = number %3;
//		remainders[2] = number %4;
//		remainders[3] = number %5;
//		remainders[4] = number %6;
//		remainders[5] = number %7;
//		remainders[6] = number %8;
//		remainders[7] = number %9;
//		
//		for(int asalMi: remainders) {
//			if(asalMi==0) 
//			{
//				System.out.println("Sayı asal değil");
//				
//			}
//			else 
//			{
//				System.out.println("Sayı asal");
//			}
		
		boolean isPrime = true;
		
		if(number<2) {
			System.out.println("Geçersiz sayı");
			return;
		}
		for(int i=2; i<number;i++)
		{
			if(number % i==0) 
			{
				isPrime = false;
			}
		}
		
		if(isPrime) 
		{
			System.out.println("Sayı asaldır");
		}
		else 
		{
			System.out.println("Sayı asal değildir");
		}
			
		
	}

}

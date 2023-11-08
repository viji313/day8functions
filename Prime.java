package day8functions;

public class Prime {
	int num1;

	public String findPrime(int num1) {
//		boolean b= true;
//		for(int i=2;i<num;i++)
//		{
//			if(i%num==0)
//			{
//				b=false;
//			}
//			if(b==true)
//			{
//				return "Is prime";
//			}
//			else
//			{
//				return "Is not prime";
//			}
		
		int count = 0;
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				count++;
			} 
		}
		if (count > 0) {
			return "not prime";
		} else {
			return "prime";
		}
	}
}


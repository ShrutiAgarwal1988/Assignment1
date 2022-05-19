


public class Leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1111;
		
		if((num%4==0) && (num%400==0))
			
			
		{
			System.out.println("leap year");
		}
		else if(num%100==0)
		{
			System.out.println("leap year");
			
			
		}
		
		else
		{
			System.out.println("not a leap year");
		}
	}

}

import.java.util.*;
class temp
{
	public static void main()
	{
		float ctemp, ftemp;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter temp in celcius: ");
		ctemp=sc.nextFloat();
		ftemp=(ctemp*(9/5))+32;
		System.out.println(ftemp+"degree fahrenheit");
	}
}

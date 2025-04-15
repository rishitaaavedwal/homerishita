import.java.util*;
class 3nosmax
{
	public static void main()
	{
		int n1, n2, n3, max=0;
		Scanner sc- new Scanner (System.in);
		System.out.println("enter 1st no: ");
		n1=sc.nextInt();
		System.out.println("enter 2nd no: ");
		n2=sc.nextInt();
		System.out.println("enter 3rd no: ");
		n3-sc.nextInt();
		if (n1>n2 && n1>n3)
		{
			max=n1;
		}
		else if (n2>n1 && n2>n3)
		{
			max=n2;
		}
		else
		{
			max=n3;
		}
		System.out.println(max+"is the greatest no");
	}
}

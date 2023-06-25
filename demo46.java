class demo46
{
	public static void main(String[] args)
	{
		int n=17;
		int m=n/2;
		int flag=0;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime number");
		}
	}
}
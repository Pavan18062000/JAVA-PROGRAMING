class P2 
{
	public static void main(String[] args) 
	{
		int num=3435;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		System.out.println(sum);
	}
}

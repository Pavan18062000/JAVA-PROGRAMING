//WAP TO CHECK WHETHER GIVEN NUMBER IS A SPY NUMBER OR NOT ? 
class P6 
{
	public static void main(String[] args) 
	{
		int num=132,temp=num;
		int sum=0;
		int pro=1;
		while(num!=0)
		{
			int rem=num%10;
			sum+=rem;
			pro*=rem;
			num/=10;
		}
		if(pro==sum)
			System.out.println(temp+" is spy no");
		else
			System.out.println(temp+" is not spy no");
	}
}

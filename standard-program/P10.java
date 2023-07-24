//WAP TO CHECK WHETHER GIVEN NUMBER IS STRONG NUMBER OR NOT ?
class P10 
{
	public static void main(String[] args) 
	{
		int num=145,temp=num;
		int sum=0;
		while(num!=0)
		{
			int pro=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				pro=pro*i;
			}
			sum=sum+pro;
			num/=10;
		}
		if(temp==sum)
			System.out.println(temp +" number is Strong no ");
		else
			System.out.println(temp +" number is not Strong no ");

	}
}

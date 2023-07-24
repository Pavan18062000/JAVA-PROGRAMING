//WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT NUMBER OR NOT ? 
class  P7
{
	public static void main(String[] args) 
	{
		int num=28;
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		if(num==sum)
			System.out.println(num+" is perfect number");
		else
			System.out.println(num+" is not perfect number");


	}
}

//WAP TO CHECK WHETHER GIVEN NUMBER IS PALINDROME OR NOT ?
class P3 
{
	public static void main(String[] args) 
	{
		int num=121,temp=num,sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		if(sum==temp)
			System.out.println(temp+" is palindrome number");
		else
			System.out.println(temp+" is not palindrome number");
	}
}

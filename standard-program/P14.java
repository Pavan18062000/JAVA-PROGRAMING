//WAP TO PRINT SPY NUMBER BY READING IT'S POSITION OF NUMBER ?
import java.util.Scanner;
class P14
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no :" );
		int num=sc.nextInt();
		int temp=num;
		int sum=0,pro=1;
		while(num!=0)
		{
			int rem=num%10;
			pro=pro*rem;
			sum+=rem;
			num/=10;
		}

		if(pro==sum)
			System.out.println(temp +" is spy number " );
		else
			System.out.println(temp+" is not spy number ");
	}
}
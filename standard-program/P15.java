//WAP TO PRINT PERFECT NUMBER BY READING IT'S POSITION OF NUMBER ?
import java.util.Scanner;
class P15
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no :" );
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum+=i;
		}

		if(sum==temp)
			System.out.println(temp +" is perfect number " );
		else
			System.out.println(temp+" is not perfect number ");
	}
}

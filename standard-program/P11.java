//WAP TO PRINT THE X POWER N ?
import java.util.Scanner;
class P11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();
		int power=sc.nextInt();
		int res=1;
		for(int i=1;i<=power;i++)
		{
			res=res*num;
		}
		System.out.println(res);
	}
}

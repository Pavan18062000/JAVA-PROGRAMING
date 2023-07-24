//)WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT SQUARE OR NOT 
class P8 
{
	public static void main(String[] args) 
	{
		int num=4;
		int pro=1;
		for(int i=1;i<=num/2;i++)
		{
			pro=i*i;
			if(num==pro)
			{
				System.out.println(num+" is perfect square");
				break;
			}
				
		}
		if(num!=pro)
			System.out.println(num+" is not perfect square");	
	}
}

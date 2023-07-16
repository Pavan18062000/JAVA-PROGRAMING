class P50 
{
	public static void main(String[] args) 
	{
		int star=-1,space=4;
		for(int i=1;i<=4;i++)
		{	
			
			space--;star+=2;	
			char ch='A';
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
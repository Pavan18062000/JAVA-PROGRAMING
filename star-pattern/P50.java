class P50 
{
	public static void main(String[] args) 
	{
		int star=9,space=-1;
		for(int i=1;i<=4;i++)
		{	
			
			space++;star-=2;	
			int num=1;
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				if((star/2)+1>j)
					System.out.print(num++);
				else
					System.out.print(num--);

			}
			System.out.println();
		}
	}
}
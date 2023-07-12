class P10
{
	public static void main(String[] args) 
	{
		char ch='a';
		
		for(int i=1;i<=5;i++)
		{
			
			
			for(int j=1;j<=5;j++)
			{
				if(i==j || i+j==6)
				{
					if(i<=2)
					{
					System.out.print(ch);
					ch++;
					}
					else
					{
						ch++;
						System.out.print(ch);
					}	
				}
				else
					System.out.print("*");

				
			}
			System.out.println();
		}
	}
}

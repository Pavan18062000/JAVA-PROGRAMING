class P37 
{
	public static void main(String[] args) 
	{
		
		
		int star=6;
		for(int i=1;i<=5;i++)
		{
			char ch='a';
			int num=5;
			star--;
			for(int j=1;j<=star;j++)
			{
				if(i%2==1)
					System.out.print(num--);
				else
					System.out.print(ch++);
			}
			System.out.println();
		}
	}
}

class P17 
{
	public static void main(String[] args) 
	{
		char ch='i';
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4;j++)
			{
				System.out.print(ch);
				if(ch>'a')
					ch--;
				else 
					ch='i';
			}
			System.out.println();
		}
	}
}

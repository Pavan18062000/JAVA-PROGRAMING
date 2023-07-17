class P36 
{
	public static void main(String[] args) 
	{
		int space=-1;
		int star=6;
		for(int i=1;i<=5;i++)
		{
			char ch='e';
			space++;
			star--;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(ch--);
			}
			System.out.println();
		}
	}
}

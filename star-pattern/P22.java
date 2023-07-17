class P22 
{
	public static void main(String[] args) 
	{
		char ch='a';
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1|| j==5)
				{
					System.out.print(ch);
					ch++;
				}
				else if(j==2 || j==4)
				{
					System.out.print(num);
					num++;
				}
				else
					System.out.print("+");

			}
			System.out.println();
		}
	}
}

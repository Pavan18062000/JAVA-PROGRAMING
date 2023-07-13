class P23
{
	public static void main(String[] args) 
	{
		char ch='a';
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((j==1|| j==3|| j==5) && i<5)
				{
					System.out.print(ch);
					if(i<5)
						ch++;
				}
				else if(i==5 && j==3)
					System.out.print("+");
				else if(i==5 && (j==1 || j==5))
				{
						ch='i';
						if(j==5)
						ch='j';
						System.out.print(ch);
						
						
				}
				else
				{
					System.out.print(num);
					num++;
				}
			}
		System.out.println();
		}
	}
}

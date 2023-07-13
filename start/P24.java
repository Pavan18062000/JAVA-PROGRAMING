class P24  
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			char ch='a'; int num=1;
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5)
				{
					System.out.print(num);
					num++;
				}
				else if(i%2==0)
				{
					System.out.print(ch);
					ch++;
				}
				else 
				{
					System.out.print("+");
				}
			}
			System.out.println();
		}

	}
}

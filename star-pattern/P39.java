class P39 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4f;i++)
		{
			int temp;
			if(i==1)
				temp=1;
			else if(i==2)
				temp=3;
			else if(i==3)
				temp=6;
			else
				temp=10;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp--);
			}
			System.out.println();
		}
	}
}

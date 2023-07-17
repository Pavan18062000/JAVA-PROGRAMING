class P27 
{
	public static void main(String[] args) 
	{
		int num=1;char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(((j==1 || j==5) && (i<3)) || ((j==1 || j==5) && (i>3)))
				{
					System.out.print(num);
					num++;
				}
				else if(i==3 || j==3)
				{
					System.out.print("#");
					
				}
				else
				{
					System.out.print(ch);
					ch++;
				}
			}
			System.out.println();
		}
	}
}

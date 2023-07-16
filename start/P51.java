class P51 
{
	public static void main(String[] args) 
	{
		int star=-1,space=4;
		
		for(int i=1;i<=7;i++)
		{	char ch='A';
			if(i<=4){
			space--;star+=2;	
			}
			else{
				space++;star-=2;
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				if(1+star/2>j)
					System.out.print(ch++);
				else
					System.out.print(ch--);
			}
			System.out.println();
		}
	}
}
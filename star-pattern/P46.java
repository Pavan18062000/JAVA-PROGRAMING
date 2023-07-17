class P46 
{
	public static void main(String[] args) 
	{
		int star=-1,space=3;
		for(int i=1;i<=5;i++)
		{	if(i<=3){
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
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
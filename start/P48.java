class P48 
{
	public static void main(String[] args) 
	{
		int star=-1,space=4;
		int num=1;
		for(int i=1;i<=7;i++)
		{	
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
				System.out.print(num);
			}
			if(i<=3)
				num++;
			else
				num--;

			System.out.println();
		}
	}
}
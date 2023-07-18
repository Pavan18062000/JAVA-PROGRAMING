//WAP TO PRINT SMALLEST OF 4 NUMBERS ?
class B 
{
	public static void main(String[] args) 
	{
		int a=10,b=5,c=30,d=40;
		int res =(a<b && a<b && a<c && a<d)?a:(b<c && b<d)?b:(c<d)?c:d;
		System.out.println(res);
	}
}

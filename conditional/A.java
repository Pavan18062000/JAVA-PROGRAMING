//WAP TO PRINT LARGEST OF 5 NUMBERS ?
class A 
{
	public static void main(String[] args) 
	{
		int a=10,b=5,c=30,d=40,e=11;
		int res =(a>b && a>b && a>c && a>d && a>e)?a:(b>c && b>d && b>e)?b:(c>d && d>e)?c:(d>e)?d:e;
		System.out.println(res);
	}
}

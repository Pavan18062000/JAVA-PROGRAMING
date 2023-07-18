//WAP TO PRINT Largest OF 7 NUMBERS ?
class D 
{
	public static void main(String[] args) 
	{
		int a=10,b=5,c=30,d=40,e=4,f=3,g=1;
		int res =(a>b  && a>c && a>d && a>e && a>f && a>g)?a:(b>c && b>d && b>e && b>f && b>g)?b:(c>d && c>e && c>f && c>g)?c:(d>e && d>f && d>g)?d:(e>f && e>g)?e:(f>g)?f:g;
		System.out.println(res);
	}
}

//WAP TO CHECK SMALLEST OF THREE NUMBERS 
class G 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=80;
		int res=a<b && a<c? a : b<c? b:c;
		System.out.println(res);
	}
}

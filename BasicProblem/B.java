//)WAP TO SWAP TWO VARIBLES WITHOUT USING ANOTHER VARIABLE ?
class B 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a = " +a);
		System.out.println("the value of b = " + b);
	}
}

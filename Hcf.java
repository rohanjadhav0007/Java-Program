import java.util.Scanner;
class Hcf
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int n1=sc.nextInt();
		System.out.println("Enter a second number: ");
		int n2=sc.nextInt();
		
		int hcf=(n1<n2)?n1:n2;
		while(true)
		{
			if((n1%hcf)==0 && (n2%hcf)==0)
			{
				System.out.println("the hcf of number is: "+hcf);
				break;
			}
			hcf--;
		}
	}
}
import java.util.Scanner;
public class Sum{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println(sum);
	}
	
}
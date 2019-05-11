import java.util.Scanner;

public class SumOfNumbers
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.print("请输入一个1~1000的数字: ");
		int x=input.nextInt();
		
		int y=x%10;
		int z=x/10%10;
		int w=x/100%10;

		System.out.println("The sum of digits is "+(w+z+y));
	}
}
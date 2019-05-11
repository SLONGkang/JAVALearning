import java.util.Scanner;

public class TestBooleanOperators
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入一个正整数:");
		int x=input.nextInt();
		
		System.out.println(x+"是否能被3整除？"+(x%3==0)+"\n"+x+"是否能被2整除？"+(x%2==0));
	}
}
import java.util.Scanner;

public class TestBooleanOperators
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("������һ��������:");
		int x=input.nextInt();
		
		System.out.println(x+"�Ƿ��ܱ�3������"+(x%3==0)+"\n"+x+"�Ƿ��ܱ�2������"+(x%2==0));
	}
}
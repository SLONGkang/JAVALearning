import java.util.Scanner;

public class Lottery
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int i=0;
		for(i=1;i!=0;i=i)
		{
			int lottery=(int)(Math.random()*100);
		
			System.out.print("������һ����λ�������²�Ʊ,��0�˳���");
			int guess=input.nextInt();
			i=guess;
			

			int x=guess%10;
			int y=guess/10;
		
			int x1=lottery%10;
			int y1=lottery/10;
	
			System.out.println("����"+lottery);
		
			if(guess==lottery) System.out.println("��ϲ�㣡������������10000������");
			else if(x==y1&&y==x1) System.out.println("���ˣ�������3000������");
			else if(x==x1||x==y1||y==x1||y==y1) System.out.println("������1000������");
			else System.out.println("Sorry!��ʲô��û�õ�~");
		}
	}
}
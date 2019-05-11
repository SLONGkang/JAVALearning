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
		
			System.out.print("请输入一个两位数来竞猜彩票,按0退出：");
			int guess=input.nextInt();
			i=guess;
			

			int x=guess%10;
			int y=guess/10;
		
			int x1=lottery%10;
			int y1=lottery/10;
	
			System.out.println("答案是"+lottery);
		
			if(guess==lottery) System.out.println("恭喜你！！！！你获得了10000美刀！");
			else if(x==y1&&y==x1) System.out.println("好运！你获得了3000美刀！");
			else if(x==x1||x==y1||y==x1||y==y1) System.out.println("你获得了1000美刀！");
			else System.out.println("Sorry!你什么都没得到~");
		}
	}
}
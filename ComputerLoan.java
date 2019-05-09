import java.util.Scanner;
public class ComputerLoan {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("Please enter 年利率，年数和贷款总数：");
		double n=input.nextDouble();
		
		int year=input.nextInt();
		double loan=input.nextDouble();
		double y=n/1200;
		double pay=loan*y/(1-1/Math.pow((1+y),year*12));
		double totalpay=pay*year*12.0;
		System.out.println("mouth is "+(int)(pay*100)/100.0);
		System.out.println("Years is "+(int)(totalpay*100)/100.0);
}
}
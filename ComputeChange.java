import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter an amount in double, for example 11.54: ");
		double totalmoney=input.nextDouble();
		double fen=totalmoney*100;
		int dollar=(int)fen/100;
		fen=fen%100.0;
		int quarter=(int)fen/25;
		fen=fen%25.0;
		int dime=(int)fen/10;
		fen=fen%10.0;
		int nickel=(int)fen/5;
		fen=fen%5.0;
		int penny=(int)fen;

		System.out.println(dollar+" dollars \n"+quarter+" quarters \n"+dime+" dimes \n"+nickel+" nickels \n"+penny+" pennys \n");
}
}
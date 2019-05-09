import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog
{
	public static void main(String[] args)
	{
		String annualInterestRateString = JOptionPane.showInputDialog(
		"请输入年利率:");

		double annualInterestRate=Double.parseDouble(annualInterestRateString);

		double mouthRate = annualInterestRate/1200;
		
		String numberYear=JOptionPane.showInputDialog(
		"请输入年数:");

		int numberOfYear=Integer.parseInt(numberYear);

		String loanString=JOptionPane.showInputDialog(
		"请输入贷款金额:");

		double loan=Double.parseDouble(loanString);

		double mouthPay=loan*mouthRate/(1-1/Math.pow(1+mouthRate,numberOfYear*12.0));

		double totalPay=mouthPay*12*numberOfYear;

		mouthPay=(int)(mouthPay*100)/100.0;

		totalPay=(int)(totalPay*100)/100.0;

		String output="The mouthly payment is "+mouthPay+
		"\nThe total payment is "+totalPay;
	
		JOptionPane.showMessageDialog(null,output);
	}	
}
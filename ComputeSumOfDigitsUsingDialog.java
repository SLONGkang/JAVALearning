import javax.swing.JOptionPane;

public class ComputeSumOfDigitsUsingDialog
{
	public static void main(String[] args)
	{
		String xSt=JOptionPane.showInputDialog("������һ��1~1000֮������֣�");
		int x=Integer.parseInt(xSt);
	
		int y=x%10,z=x/10%10,w=x/100%10;

		String output="The sum of the digits is "+(w+z+y);

		JOptionPane.showMessageDialog(null,output);
	}
}
import javax.swing.JOptionPane;

public class BooleanUsingDialog
{
	public static void main(String[] args)
	{
		String numString=JOptionPane.showInputDialog("请输入一个整数:");
		int num=Integer.parseInt(numString);

		String output=num+"是否能被2整除？"+(num%2==0)+"\n"+num+"是否能被3整除？"+(num%3==0);
		JOptionPane.showMessageDialog(null,output);
	}
}
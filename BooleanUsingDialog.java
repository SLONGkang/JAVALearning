import javax.swing.JOptionPane;

public class BooleanUsingDialog
{
	public static void main(String[] args)
	{
		String numString=JOptionPane.showInputDialog("������һ������:");
		int num=Integer.parseInt(numString);

		String output=num+"�Ƿ��ܱ�2������"+(num%2==0)+"\n"+num+"�Ƿ��ܱ�3������"+(num%3==0);
		JOptionPane.showMessageDialog(null,output);
	}
}
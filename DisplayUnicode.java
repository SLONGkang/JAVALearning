import javax.swing.JOptionPane;

public class DisplayUnicode {

	public static void main(String[] args){

		for(int i=0;i<20;i++)
		{
			JOptionPane.showMessageDialog(null,
			"\u6B22\u8FCE \u03b1 \u03b2 \u03b3华毕然是大傻逼？",
			 "\u6B22\u8FCE Welcome康世龙",
			JOptionPane.INFORMATION_MESSAGE);
			continue;
		}
}
}
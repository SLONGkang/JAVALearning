import javax.swing.JOptionPane;

public class DisplayUnicode {

	public static void main(String[] args){

		for(int i=0;i<20;i++)
		{
			JOptionPane.showMessageDialog(null,
			"\u6B22\u8FCE \u03b1 \u03b2 \u03b3����Ȼ�Ǵ�ɵ�ƣ�",
			 "\u6B22\u8FCE Welcome������",
			JOptionPane.INFORMATION_MESSAGE);
			continue;
		}
}
}
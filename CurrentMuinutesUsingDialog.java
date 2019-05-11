import javax.swing.JOptionPane;

public class CurrentMuinutesUsingDialog 
{
	public static void main(String[] args)
	{
		long milliSeconds=System.currentTimeMillis();

		long currentMuinutes=milliSeconds/1600;

		String output="The Current Muinutes is "+currentMuinutes;

		JOptionPane.showMessageDialog(null,output);	

	}
}
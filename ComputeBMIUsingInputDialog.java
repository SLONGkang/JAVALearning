import javax.swing.JOptionPane;

public class ComputeBMIUsingInputDialog{

	public static void main(String[] args){
		
		String weightString = JOptionPane.showInputDialog("�������������(kg):");
		double weight=Double.parseDouble(weightString);

		String heightString = JOptionPane.showInputDialog("������������(cm):");
		double height = Double.parseDouble(heightString);

		double BMI=weight/Math.pow(height/100,2);

		BMI=(int)(BMI*100)/100.0;		

		String output="���BMI��:"+BMI;
		if(BMI<18.5)
			output+="\n��̫����!";
		else
			if(BMI>=18.5&&BMI<24)
				output+="\n��Ŀǰ����Ŷ~�뱣��!";
		else
			if(BMI>=24&&BMI<28)
			output+="\n���е���Ŷ~";
		else
			if(BMI>=28&&BMI<30)
			output+="\n�㴦���жȷ��֣�ע��!";
		else
			if(BMI>=30&&BMI<40)
			output+="\n�㴦�����ط��֣���������������!";
		else
			if(BMI>=40.0)
			output+="\n�㴦�ڳ������֣������ȡ��ʩ!";
			else
			;

		JOptionPane.showMessageDialog(null,output);
}
}
import javax.swing.JOptionPane;

public class ComputeBMIUsingInputDialog{

	public static void main(String[] args){
		
		String weightString = JOptionPane.showInputDialog("请输入你的体重(kg):");
		double weight=Double.parseDouble(weightString);

		String heightString = JOptionPane.showInputDialog("请输入你的身高(cm):");
		double height = Double.parseDouble(heightString);

		double BMI=weight/Math.pow(height/100,2);

		BMI=(int)(BMI*100)/100.0;		

		String output="你的BMI是:"+BMI;
		if(BMI<18.5)
			output+="\n你太轻了!";
		else
			if(BMI>=18.5&&BMI<24)
				output+="\n你目前正常哦~请保持!";
		else
			if(BMI>=24&&BMI<28)
			output+="\n你有点重哦~";
		else
			if(BMI>=28&&BMI<30)
			output+="\n你处于中度肥胖，注意!";
		else
			if(BMI>=30&&BMI<40)
			output+="\n你处于严重肥胖，建议你立即减肥!";
		else
			if(BMI>=40.0)
			output+="\n你处于超级肥胖，必须采取措施!";
			else
			;

		JOptionPane.showMessageDialog(null,output);
}
}
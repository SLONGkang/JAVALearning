import java.util.Scanner;

public class ComputeBMI{

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your weight(����) and height(���): ");
		double weight=input.nextDouble();
		double height=input.nextDouble();
		double BMI=weight/Math.pow(height/100,2);
		System.out.println(BMI);
		if(BMI<18.5)
			System.out.println("��̫����!");
		else
			if(BMI>=18.5&&BMI<24)
				System.out.println("��Ŀǰ����Ŷ~�뱣��!");
		else
			if(BMI>=24&&BMI<28)
			System.out.println("���е���Ŷ~");
		else
			if(BMI>=28&&BMI<30)
			System.out.println("�㴦���жȷ��֣�ע��!");
		else
			if(BMI>=30&&BMI<40)
			System.out.println("�㴦�����ط��֣���������������!");
		else
			if(BMI>=40.0)
			System.out.println("�㴦�ڳ������֣������ȡ��ʩ!");
			else
			;
}
}
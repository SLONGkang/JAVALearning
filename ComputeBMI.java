import java.util.Scanner;

public class ComputeBMI{

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your weight(体重) and height(身高): ");
		double weight=input.nextDouble();
		double height=input.nextDouble();
		double BMI=weight/Math.pow(height/100,2);
		System.out.println(BMI);
		if(BMI<18.5)
			System.out.println("你太轻了!");
		else
			if(BMI>=18.5&&BMI<24)
				System.out.println("你目前正常哦~请保持!");
		else
			if(BMI>=24&&BMI<28)
			System.out.println("你有点重哦~");
		else
			if(BMI>=28&&BMI<30)
			System.out.println("你处于中度肥胖，注意!");
		else
			if(BMI>=30&&BMI<40)
			System.out.println("你处于严重肥胖，建议你立即减肥!");
		else
			if(BMI>=40.0)
			System.out.println("你处于超级肥胖，必须采取措施!");
			else
			;
}
}
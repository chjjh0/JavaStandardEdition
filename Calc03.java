import java.util.Scanner;

public class Calc03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num1 = 0.0, num2 = 0.0, result1 = 0.0;
		
		System.out.println("ù�� ° ���ڸ� �Է��Ͻÿ�");
		num1 = input.nextDouble();

		System.out.println("�����ڸ� �Է��Ͻÿ�");
		String opcode = input.next();

		System.out.println("�ι� ° ���ڸ� �Է��Ͻÿ�");
		num2 = input.nextDouble();


		if(opcode.equals("+")){
			result1 = num1 + num2;
		} else if(opcode.equals("-")){
			result1 = num1 - num2;
		} else if(opcode.equals("*")){
			result1 = num1 * num2;
		} else if(opcode.equals("/")){
			result1 = num1 / num2;
		} else if(opcode.equals("%")){
			result1 = num1 % num2;
		} else {
			System.out.println("�߸� �Է��߽��ϴ�");
		}

		System.out.printf("����� %.1f %s %.1f = %.1f \n", num1, opcode, num2, result1);


}
}
import java.util.Scanner;

public class Calc04 {


//���� ������

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num1 = 0.0, num2 = 0.0, num3 = 0.0, result1 = 0.0;
		String opcode1="", opcode2 = "";
		
		System.out.println("ù�� ° ���ڸ� �Է��Ͻÿ�");
		num1 = input.nextDouble();

		System.out.println("�����ڸ� �Է��Ͻÿ�");
		opcode1 = input.next();

		System.out.println("�ι� ° ���ڸ� �Է��Ͻÿ�");
		num2 = input.nextDouble();

		System.out.println("�����ڸ� �Է��Ͻÿ�");
		opcode2 = input.next();

		System.out.println("���� ° ���ڸ� �Է��Ͻÿ�");
		num3 = input.nextDouble();



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
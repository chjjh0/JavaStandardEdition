import java.util.Scanner;

public class Calc03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num1 = 0.0, num2 = 0.0, result1 = 0.0;
		
		System.out.println("첫번 째 숫자를 입력하시오");
		num1 = input.nextDouble();

		System.out.println("연산자를 입력하시오");
		String opcode = input.next();

		System.out.println("두번 째 숫자를 입력하시오");
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
			System.out.println("잘못 입력했습니다");
		}

		System.out.printf("결과는 %.1f %s %.1f = %.1f \n", num1, opcode, num2, result1);


}
}
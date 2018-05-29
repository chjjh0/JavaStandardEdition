import java.util.Scanner;

public class Calc04 {


//삼항 연산자

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num1 = 0.0, num2 = 0.0, num3 = 0.0, result1 = 0.0;
		String opcode1="", opcode2 = "";
		
		System.out.println("첫번 째 숫자를 입력하시오");
		num1 = input.nextDouble();

		System.out.println("연산자를 입력하시오");
		opcode1 = input.next();

		System.out.println("두번 째 숫자를 입력하시오");
		num2 = input.nextDouble();

		System.out.println("연산자를 입력하시오");
		opcode2 = input.next();

		System.out.println("세번 째 숫자를 입력하시오");
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
			System.out.println("잘못 입력했습니다");
		}

		System.out.printf("결과는 %.1f %s %.1f = %.1f \n", num1, opcode, num2, result1);


}
}
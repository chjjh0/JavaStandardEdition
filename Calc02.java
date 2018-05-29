import java.util.Scanner;

public class Calc02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("숫자 2개를 입력하세요");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		double result1 = num1 + num2;
		double result2 = num1 - num2;
		double result3 = num1 * num2;
		double result4 = num1 / num2;
		double result5 = num1 % num2;

		System.out.printf("결과는 " + "%.1f + %.1f = %.1f \n", num1, num2, result1);
		System.out.printf("결과는 " + "%.1f - %.1f = %.1f \n", num1, num2, result2);
		System.out.printf("결과는 " + "%.1f * %.1f = %.1f \n", num1, num2, result3);
		System.out.printf("결과는 " + "%.1f / %.1f = %.1f \n", num1, num2, result4);
		System.out.printf("결과는 " + "%.1f + %.1f = %.1f", num1, num2, result5);
		System.out.print("\\%");
}
}
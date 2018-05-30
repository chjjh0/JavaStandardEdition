import java.util.Scanner;

public class WhileDemo {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num1 = 0, num2 = 0, tmp = 0, sum = 0;
	String result = "";
    
    System.out.print("첫번째 숫자를 입력하시오");
    num1 = scan.nextInt();
    
    System.out.print("두번째 숫자를 입력하시오");
    num2 = scan.nextInt();
    
    if(num2 < num1){
        tmp = num1;
        num1 = num2;
        num2 = tmp;
    }
    
    System.out.print("[ 범위는" + num1 + " 부터 " + num2 + " 까지입니다 ] \n");
        
    while(num1 < num2+1){
        if(num1 == num2){
            result += num1 + "=";
        } else { 
            result += num1 + "+";
        }
        sum += num1;
        if(num1 == num2){
            result += sum + "\n";
        }
        num1++;     
    }
    System.out.print(result);
	}
}

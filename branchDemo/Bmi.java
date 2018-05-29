import java.util.Scanner;

public class Bmi{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double height = 0.0;
        double weight = 0.0;        
        double bmi = 0.0;
        String name = "";
	String result = "";
        
        System.out.print("이름 ");
        name = scan.nextLine();
        
        System.out.print("몸무게 ");
        weight = scan.nextDouble();
        
        System.out.print("키 ");
        height = scan.nextDouble();
        height *= 0.01;
        
        bmi = (weight / (height * height));

	if(bmi < 20){ result = "저체중";
	} else if(bmi >= 20 && bmi <= 24) {
		result = "정상체중";
	} else if(bmi >= 25 && bmi <= 30) {
		result = "경도비만";
	} else 
		result = "비만";	
       
    System.out.printf(name + "님은 BMI 지수" + " %.1f 으로 [" + result + "] 입니다 \n", bmi);
        
    }
}
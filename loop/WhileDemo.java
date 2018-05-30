public class WhileDemo {

public static void main(String[] args){

	int count = 1, sum = 0;
	String result = "";
    while(count < 11){
        if(count == 10){
            result += count + "=";
        } else { 
            result += count + "+";
        }
        sum += count;
        if(count == 10){
        result += sum + "\n";
        }
        count++;     
    }
    System.out.print(result);
	}
}

import java.util.Scanner;

class WhileDemo2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        for(;;){
            int flag = 0;
            
            System.out.print("0: 스톱 1: 실행");
            flag = scan.nextInt();
            switch(flag){
                case 0 :
                    System.out.println("시스템을 종료합니다");
                    return;
                case 1 :
                    System.out.println("시스템을 실행합니다");
                    break;
                default : 
                    break;
            }
        }
    }
}

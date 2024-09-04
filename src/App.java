import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("계산을 종료하려면 'exit'을 입력하세요. 계속하려면 아무 키나 입력하세요: ");
            String command = sc.next();

            // 'exit' 입력 시 반복 종료
            if (command.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            for (;;) {
                try {
                    System.out.print("첫번째 양수를 입력하세요:");
                    int num = sc.nextInt();
                    if (num < 0) {
                        System.out.println("양수를 입력하세요");
                        continue;
                    }

                    System.out.print("두번째 양수를 입력하세요:");
                    int num2 = sc.nextInt();
                    if (num2 < 0) {
                        System.out.println("양수를 입력하세요");
                        continue;
                    }


                System.out.print("사칙연산 기호를 입력하세요:");
                char operator = sc.next().charAt(0);

                int result = 0;

                switch (operator) {
                    case '+':
                        result = num + num2;
                        break;
                    case '-':
                        result = num - num2;
                        break;
                    case '*':
                        result = num * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num / num2;
                        } else {
                            System.out.println("0으로 나눌 수 없습니다.");
                        }
                        break;
                    default:
                        System.out.println("잘못된 연산자입니다.");
                        return;
                }

                System.out.println("결과: " + result);
                break;
                }catch (InputMismatchException e){
                    System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                    sc.next();
                }
            }
        }

    }

}

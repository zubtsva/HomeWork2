import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String correctPassword = "moon";
        while (true) {
            System.out.println("Введите  пароль");
            String enteredPassword = scan.nextLine();
            if (correctPassword.equals(enteredPassword)) {
                System.out.println("Вы вошли в систему");
                break;
            } else if (enteredPassword.equals("exit")) {
                System.out.println("Вы вышли из системы");
                break;
            }
            System.out.println("Не верный пароль, попробуйте еще раз");
        }

    }


}
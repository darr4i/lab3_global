import java.util.Scanner;

public class BadCodeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int num = sc.nextInt(); // Не закриваємо Scanner (можливий ресурсний витік)
        System.out.println("Результат: " + divideByNumber(num)); // Можливий поділ на нуль
    }

    public static int divideByNumber(int num) {
        return 100 / num; // Може викликати ArithmeticException при num = 0
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число! Укажите через пробел нижний и верхний пределы загадываемого числа");
        int bottom = scanner.nextInt();
        int top = scanner.nextInt();
        Random rand = new Random();
        int randInt;
        randInt = rand.nextInt(top) + bottom;
        System.out.println("Введите количество попыток");
        int attempt = scanner.nextInt();
        System.out.println("Введите число");
        while (attempt >= 1) {
            int num = scanner.nextInt();
            attempt -= 1;
            if (randInt > num) {
                System.out.println("Загаданное мною число больше");
            } else if (randInt < num) {
                System.out.println("Загаданное мною число меньше");
            } else {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                return;
            }
        }
        System.out.println("Попытки закончились, не расстраивайтесь, попробуйте ещё раз!");
    }
}
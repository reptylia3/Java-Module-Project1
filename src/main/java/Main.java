import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название автомобиля " + (i + 1) + ":");
            String name = scanner.next();

            int speed = 0;
            while (true) {
                System.out.println("Введите скорость автомобиля " + name + " (от 1 до 250):");
                try {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Скорость должна быть в диапазоне от 1 до 250. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                    scanner.next(); // Очистить некорректный ввод
                }
            }

            Car car = new Car(name, speed);
            race.checkNewLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.getLeader());
    }
}
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minB = getNum(sc, "Введіть нижню межу: ");
        double maxB = getNum(sc, "Введіть верхню межу: ");
        int count = 0;

        System.out.println("x \t f(x)");
        for (double x = 0; x <= 4.0; x += 0.2) {
            double fx = 3 * x - 4 * Math.sin(x * x);
            System.out.printf("%.1f \t %.4f\n", x, fx);
            if (fx >= minB && fx <= maxB) count++;
        }

        if (count > 0) System.out.println("Кількість значень у діапазоні: " + count);
        else System.out.println("Значень у діапазоні не знайдено.");
    }

    public static double getNum(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (sc.hasNextDouble()) return sc.nextDouble();
            System.out.println("Помилка! Введіть число.");
            sc.next();
        }
    }
}
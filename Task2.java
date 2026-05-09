public class Task2 {
    public static void main(String[] args) {
        System.out.println("--- Спосіб 1: Цикл FOR ---");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.println(h + " h " + m + " min");
            }
        }

        System.out.println("\n--- Спосіб 2: Цикл WHILE ---");
        int h = 0;
        while (h <= 2) {
            int m = 0;
            while (m <= 59) {
                System.out.println(h + " h " + m + " min");
                m++;
            }
            h++;
        }
    }
}
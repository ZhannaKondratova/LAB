public class Task3 {
    public static void main(String[] args) {
        int h = 0, m = 0, s = 0;
        System.out.println("--- Синхронний відлік ---");
        while (h < 3) {
            System.out.printf("%d h %d min %d sec\n", h, m, s);
            if (h == 2 && m == 59 && s == 59) break;

            m++;
            s++;

            if (s > 59) s = 0;
            if (m > 59) {
                m = 0;
                h++;
            }
        }
    }
}
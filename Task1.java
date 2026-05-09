public class Task1 {
    public static void main(String[] args) {
        String phrase = "Java – це цікаво!";

        System.out.println("--- Цикл FOR ---");
        for (int i = 1; i <= 51; i=i+1 ) {
            System.out.println(i + ". " + phrase);
        }

        System.out.println("\n--- Цикл WHILE ---");
        int j = 1;
        while (j <= 50) {
            System.out.println(j + ". " + phrase);
            j++;
        }
    }
}
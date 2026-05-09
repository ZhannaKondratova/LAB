import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // 1. Масиви по 50
        int[] even = new int[50], odd = new int[50];
        for (int i = 0; i < 50; i++) {
            even[i] = i * 2;
            odd[i] = i * 2 + 1;
        }
        System.out.println("Парний масив: " + Arrays.toString(even));

        // 2. Масив з 10 чисел
        int[] nums = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.print("\nНепарні індекси: ");
        for (int i = 1; i < nums.length; i += 2) System.out.print(nums[i] + " ");

        System.out.print("\nЗворотній порядок: ");
        for (int i = nums.length - 1; i >= 0; i--) System.out.print(nums[i] + " ");

        // 4. Зміна знаку непарних елементів
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) nums[i] = -nums[i];
        }
        System.out.println("\nПісля зміни знаку: " + Arrays.toString(nums));
    }
}
package pro.sky;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();

    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int Task1Service() {
        int sumMonthCost = 0;
        for (int j : arr) {
            sumMonthCost = sumMonthCost + j;
        }
        return sumMonthCost;
    }

    public static void Task1() {
        System.out.println("Сумма трат за месяц составила " + Task1Service() + " рублей.");
    }

    public static void Task2() {

        int maxDailyCost = -1;
        int minDailyCost = 250_000;
        for (final int currentDailyCost : arr) {
            if (currentDailyCost > maxDailyCost) {
                maxDailyCost = currentDailyCost;
            }
        }
        for (final int currentDailyCost : arr) {
            if (currentDailyCost < minDailyCost) {
                minDailyCost = currentDailyCost;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDailyCost + " рублей. Максимальная сумма трат за день составила " + maxDailyCost + " рублей.");
    }

    public static void Task3() {

        double monthLength = 30;
        double sumMonthCost = Task1Service();
        double avgMonthCost = sumMonthCost / monthLength;
        String avgMonthCostRound = String.format("%.2f", avgMonthCost);
        System.out.println("Средняя сумма трат за месяц составила " + avgMonthCostRound + " рублей.");
    }

    public static void Task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(reverseFullName));
        int n = reverseFullName.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            if (i != reverseFullName.length - 1) {
                System.out.print(reverseFullName[i] + " ");
            } else {
                System.out.print(reverseFullName[i]);
            }
        }
        System.out.println();
    }
}
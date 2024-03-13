package taskNumberTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        String priorityString = scanner.nextLine();
        String[] arrPriorityString = priorityString.split(" ");
        int[] arrPriority = new int[k];
        for (int i = 0; i < k; i++) {
            arrPriority[i] = Integer.parseInt(arrPriorityString[i]);
        }

        String[][] arrNumbers = new String[N][];
        for (int j = 0; j < N; j++) {
            String numString = scanner.nextLine();
            String[] arrNumString = numString.split(" ");
            arrNumbers[j] = arrNumString;
        }

        System.out.println(N);
        System.out.println(k);
        System.out.println(Arrays.toString(arrPriority));
        System.out.println(Arrays.deepToString(arrNumbers));
    }
}

package taskNumberTen;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrSpeed = new int[N];
        for (int i = 0; i < N; i++) {
            arrSpeed[i] = scanner.nextInt();
        }
        System.out.println(findMinSpeed(N, arrSpeed));
    }
    public static int findMinSpeed (int N, int[] arrSpeed) {
        int totalSpeed = 0;
        int minSpeed = Integer.MIN_VALUE;
        if (N < 3) {
            for (int i = 0; i < N; i++) {
                minSpeed = Math.max(arrSpeed[i], minSpeed);
            }
        } else {
            for (int i = 0; i < N; i++) {
                totalSpeed += arrSpeed[i];
            }
        }
        return Math.max(totalSpeed, minSpeed);
    }
}

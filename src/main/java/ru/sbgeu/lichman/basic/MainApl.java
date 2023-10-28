package ru.sbgeu.lichman.basic;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.IntStream;

public class MainApl {
    public static void main(String[] args) {

        hello(10, "Домашка!");
        massiv1(new int[]{6, 8, 9, 6, 9});
        massiv2(5, new int[]{6, 8, 9});
        massiv3(4, new int[]{3, 5, 5});
        int[] array = new int[]{11, 10, 2, 3, 4, 5};
        massiv4(array);

    }

    public static void hello(int home, String word) {
        for (int i = 1; i <= home; i++) {
            System.out.println("Домашка!");
        }
    }

    public static void massiv1(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 5) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }

    public static void massiv2(int number, int[] array) {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));

    }


    public static void massiv3(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] + a;
        }
        System.out.println(Arrays.toString(b));

    }

    public static void massiv4(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sum1 = sum1 + array[i];
            } else {
                sum2 = sum2 + array[i];
            }
        }
        if (sum1 > sum2) {
            System.out.println(sum1);
        } else if (sum1 < sum2) {

        } else {
            System.out.print("Они равны");
        }

    }
}












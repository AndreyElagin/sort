package com.study;

public final class InsertionSort {

    private InsertionSort() {}

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (array[j + 1] < array[j]) {
                    final int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}

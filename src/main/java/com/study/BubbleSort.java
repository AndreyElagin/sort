package com.study;

public final class BubbleSort {

    private BubbleSort() {}

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int buf = array[j];
                    array[j] = array[i];
                    array[i] = buf;
                }
            }
        }
    }

}

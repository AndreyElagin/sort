package com.study;

public final class BubbleSort {

    private BubbleSort() {}

    public static void sort(int[] array) {

        final int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i] < array[j]) {
                    int buf = array[j];
                    array[j] = array[i];
                    array[i] = buf;
                }
            }
        }
    }

}

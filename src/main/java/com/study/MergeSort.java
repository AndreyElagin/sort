package com.study;

public final class MergeSort {

    private static int[] aux;

    private MergeSort() {}

    public static void sort(int[] array) {
        aux = new int[array.length];
        sort(array, 0, array.length - 1);
    }

    private static void merge(int array[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        System.arraycopy(array, low, aux, low, high + 1 - low);

        for (int k = low; k < high; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > high) {
                array[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                array[k] = aux[j++];
            } else {
                array[k] = aux[i++];
            }
        }
    }

    private static void sort(int[] array, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

}

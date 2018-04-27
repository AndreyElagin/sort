package com.study;

public final class MergeSort {

    private MergeSort() {
    }

    public static void sort(int[] array) {
        int[] aux = new int[array.length];
        sort(aux, array, 0, array.length - 1);
    }

    private static void merge(int aux[], int array[], int low, int mid, int high) {
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

    private static void sort(int aux[], int[] array, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(aux, array, low, mid);
        sort(aux, array, mid + 1, high);
        merge(aux, array, low, mid, high);
    }

}

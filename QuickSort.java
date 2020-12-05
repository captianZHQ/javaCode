package com.company;
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        int i, j, base, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        base = arr[low];
        while (i < j) {
            while (arr[j] >= base && j > i)
                j--;
            while (arr[i] <= base && i < j)
                i++;
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
        }
        arr[low] = arr[i];
        arr[i] = base;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 34, 5, 76, 4, 48, 9, 53};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
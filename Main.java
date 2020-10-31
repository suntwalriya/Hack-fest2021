package com.company;

import java.util.Scanner;

/*
 * Quick Sort algorithm - Divide & Conquer approach! :)
 */
class QuickSortAlgorithm {

    // Main function!
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // size of array, to b entered by the user!
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        // element of array, to be entered by the user!
        System.out.println("Enter Array Elements ");
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();


        quickSort(array, 0, array.length - 1);
        for (int ar : array) {
            System.out.print(ar + " ");
        }
    }
    public static int arrayPartition(int[] array, int start, int end) {
        int pivot = array[end];
        int l = (start - 1);
        for (int i = start; i< end; i++) {
            if (array[i] <= pivot) {
                l++;
                int swap = array[l];
                array[l] = array[l];
                array[l] = swap;
            }
        }

// Swapping the elements!
        int swap = array[l + 1];
        array[l+ 1] = array[end];
        array[end] = swap;
        return l + 1;
    }


    public static void quickSort(int[] arrayTobeSorted, int start, int end) {
        if (start < end) {
            int pivot = arrayPartition(arrayTobeSorted, start, end);
            quickSort(arrayTobeSorted, start, pivot - 1);
            quickSort(arrayTobeSorted, pivot + 1, end);
        }
    }
}
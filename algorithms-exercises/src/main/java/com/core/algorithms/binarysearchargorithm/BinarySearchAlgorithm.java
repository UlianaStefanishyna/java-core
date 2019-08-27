package com.core.algorithms.binarysearchargorithm;

/**
 * binary-search algorithm is used to search for the index of the given element in the SORTED array.
 * Time complexity is O(logN)
 */
public class BinarySearchAlgorithm {

    private int binarySearchRecursiveSolution(int[] array, int key, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (array[mid] == key) {
            return mid;
        } else if (key < array[key]) {
            return binarySearchRecursiveSolution(array, key, low, mid - 1);
        } else {
            return binarySearchRecursiveSolution(array, key, mid + 1, high);
        }
    }

    private int binarySearchIterativeSolution(int[] array, int key, int low, int high) {
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] == key) {
                return mid;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public void binarySearch(int[] array, int key) {
        int resRec = binarySearchRecursiveSolution(array, key, 0, array.length - 1);
        int resIter = binarySearchIterativeSolution(array, key, 0, array.length - 1);

        System.out.println("res Rec = " + resRec);
        System.out.println("res Iter = " + resIter);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100};

        new BinarySearchAlgorithm().binarySearch(arr1, 12);
    }
}

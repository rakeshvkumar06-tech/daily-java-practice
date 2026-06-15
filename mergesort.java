public class mergesort {

    // Method to merge two sorted halves
    static void mergeSortArray(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        // Compare elements from both halves
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half
        while (i < mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right half
        while (j < end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy merged elements back to original array
        for (int m = 0; m < temp.length; m++) {
            arr[start + m] = temp[m];
        }
    }

    // Recursive Merge Sort
    static void mergeSort(int[] arr, int start, int end) {

        if (end - start <= 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        mergeSortArray(arr, start, mid, end);
    }

    public static void main(String[] args) {

        int[] arr = {6, 7, 2, 8, 4, 5, 1, 3, 9};

        mergeSort(arr, 0, arr.length);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
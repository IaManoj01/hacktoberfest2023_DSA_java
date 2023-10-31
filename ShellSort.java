public class ShellSort {
    public static void main(String[] args) {
        int[] array = {12, 34, 54, 2, 3};
        shellSort(array);
        System.out.println("Sorted array using Shell Sort:");
        printArray(array);
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform insertion sort for elements at current gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                // Shift elements until the correct position is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Place the current element at its correct position
                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

package DIVandCONQ;


    public class QuickSort {

        // Main function to call QuickSort
        public static void quickSort(int[] arr, int left, int right) {
            if (left < right) {
                int partitionIndex = partition(arr, left, right);

                // Recursively sort elements before and after partition
                quickSort(arr, left, partitionIndex - 1);
                quickSort(arr, partitionIndex, right);
            }
        }

        // Partition function using middle element as pivot
        public static int partition(int[] arr, int left, int right) {
            int middle = left + (right - left) / 2;  // Avoid overflow
            int pivot = arr[middle];

            while (left <= right) {
                // Move left pointer to the right until a value >= pivot is found
                while (arr[left] < pivot) {
                    left++;
                }
                // Move right pointer to the left until a value <= pivot is found
                while (arr[right] > pivot) {
                    right--;
                }
                // Swap elements if left <= right
                if (left <= right) {
                    swap(arr, left, right);
                    left++;
                    right--;
                }
            }
            return left;
        }

        // Swap function
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Main method to run the code
        public static void main(String[] args) {
            int[] arr = { 6,8,3,2,4 };
            System.out.println("Original Array:");
            printArray(arr);

            quickSort(arr, 0, arr.length - 1);

            System.out.println("Sorted Array:");
            printArray(arr);
        }

        // Print array function
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }



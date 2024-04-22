public class LinearSearch {
    public static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        
        int[] array = InitializeArray.initializeArray(10, 1, 100);
        System.out.println("Array:");
        printArray(array);
        int target = 42;
        int index = performLinearSearch(array, target);
 
        if (index != -1) {
            System.out.println("\nElement " + target + " found at index " + index);
        } else {
            System.out.println("\nElement " + target + " not found in the array");
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


public class SliceArray {
    public static int[] sliceArray(int[] arr, int start, int end) {
            if (start < 0 || end > arr.length || start > end) {
            throw new IllegalArgumentException("Invalid start and/or end index");
        }
        
        int[] slicedArray = new int[end - start];
        int index = 0;
        
        for (int i = start; i < end; i++) {
            slicedArray[index++] = arr[i];
        }
        
        return slicedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 2;
        int end = 7;
        
        int[] sliced = sliceArray(array, start, end);
        
        System.out.println("Original Array:");
        printArray(array);
        
        System.out.println("\nSliced Array:");
        printArray(sliced);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}





public class Fibonacci {
    public static int[] generateFibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        if (n >= 1) {
            fibonacci[0] = 0;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        generateFibonacci(fibonacci, n - 1);
        return fibonacci;
    }

    private static void generateFibonacci(int[] fibonacci, int n) {
        if (n <= 1) {
            return;
        }
        fibonacci[n] = fibonacci[n - 1] + fibonacci[n - 2];
        generateFibonacci(fibonacci, n - 1);
    }

    public static void main(String[] args) {
        int n = 10; 
        int[] fibonacci = generateFibonacciSequence(n);
        
        System.out.println("Fibonacci Sequence:");
        printArray(fibonacci);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


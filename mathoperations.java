// Addition
package com.math.operations;

public class Addition {
    public static int add(int a, int b) {
        return a + b;
    }
}


// Subtraction
package com.math.operations;

public class Subtraction {
    public static int subtract(int a, int b) {
        return a - b;
    }
}


// Multiplication
package com.math.operations;

public class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}


// Division
package com.math.operations;

public class Division {
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}

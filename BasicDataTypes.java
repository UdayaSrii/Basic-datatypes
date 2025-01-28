public class BasicDataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 100; 
        short shortVar = 3200; 
        int intVar = 100000; 
        long longVar = 1000000L;
        float floatVar = 3.14f; 
        double doubleVar = 3.14159265359; 
        char charVar = 'A'; 
        boolean booleanVar = true; 
        String stringVar = "Hello, World!";
        // Print the values of the variables
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Integer value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Character value: " + charVar);
        System.out.println("Boolean value: " + booleanVar);
        System.out.println("String value: " + stringVar);
        int castedInt = (int) floatVar; 
        System.out.println("Casted integer value from float: " + castedInt);
        int a = 5;
        double b = 6.2;
        double result = a + b; 
        // Print the result of the addition
        System.out.println("Result of int + double: " + result);
    }
}


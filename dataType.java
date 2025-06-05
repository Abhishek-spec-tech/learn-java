public class dataType {
    public static void main(String[]args){
         byte b = 100;              // 1 byte
        short s = 10000;           // 2 bytes
        int i = 123456789;         // 4 bytes
        long l = 12345678901L;     // 8 bytes (note the 'L')

        // 2. Floating-point types
        float f = 12.34f;          // 4 bytes (note the 'f')
        double d = 1234.56789;     // 8 bytes

        // 3. Character
        char c = 'A';              // 2 bytes

        // 4. Boolean
        boolean bool = true;       // 1 bit

        // 5. String (not primitive, but commonly used)
        String str = "Hello Java";

        // Printing all values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + bool);
        System.out.println("String value: " + str);
    }
}

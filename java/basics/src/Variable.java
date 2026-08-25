package java.basics.src;
// Variable naming rool

// int age;          // ✅
// int studentAge;   // ✅
// int _age;         // ✅
// int $price;       // ✅

// int 1age;         // ❌ number se start nahi
// int student-age;  // ❌ '-' allowed nahi
// int student age;  // ❌ space allowed nahi
// int class;        // ❌ Java keyword

// variable naming convention - camelCase
// int studentAge;
// String studentName;
// double accountBalance;
// int totalMarks;
// boolean isLoggedIn;

// avoid ❌
// int student_age;
// int StudentAge;
// int STUDENTAGE;

// Variable       → camelCase
// studentName

// Constant       → UPPER_SNAKE_CASE
// MAX_SIZE

// Class          → PascalCase
// StudentAccount

// Method         → camelCase
// calculateTotal()

// Boolean        → is/has/can/should
// isActive
// hasPermission
// canLogin
// shouldUpdate


public class Variable {
    public static void main(String[] args) {
        // ❎ Variable = a reusable container for a value
        //               a variable behaves as if it was the value it contains

        // 🟥 Primitive = simple value stored directaly in memory (Stack)
        // 🟦 Reference = memore address (Stack) that points to the (Heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------      ---------
        //    int->4          String
        //    double->8       Array
        //    char->2         Object
        //    boolean
        //    byte->1
        //    short->2
        //    float->4
        //    long->8

        // Steps to creating a variable
        // 1. declearation
        // 2. assignment

        
        // Integer Types

        byte b = 127;
        // Size: 1 byte = 8 bits
        // Range: -128 to 127

        System.out.println("byte b : " + b);

        short s = 32767;
        // Size: 2 bytes = 16 bits
        // Range: -32,768 to 32,767

        System.out.println("short s : " + s);

        int i = 2147483647;
        // Size: 4 bytes = 32 bits
        // Range: -2^31 to 2^31 - 1

        System.out.println("int i : " + i);

        long l = 9223372036854775807L;  // in last put (L)
        // Size: 8 bytes = 64 bits
        // Range: -2^63 to 2^63 - 1

        System.out.println("long l : " + l);

        // Floating-Point Types

        float f = 3.14f;    // in put (f)
        // Size: 4 bytes = 32 bits
        // Approx range: ±3.4 × 10^38

        System.out.println("float f : " + f);

        double d = 3.141592653589793;
        // Size: 8 bytes = 64 bits
        // Approx range: ±1.7 × 10^308

        System.out.println("double d : " + d);


        // Character Type

        char ch = 'A';
        // Size: 2 bytes = 16 bits
        // Range: 0 to 65,535
        // Uses UTF-16 code units

        System.out.println("char ch : " + ch);


        // Boolean Type

        boolean flag = true;
        // Value: true or false
        // Java does NOT define a fixed memory size for boolean

        System.out.println("boolean flag : " + flag);

        // Reference variable

        String name = "Raviranjan"; // here, name is refrence variable
        System.out.println("Hello," + name + "!");

        // int[] numbers = {10, 20, 30};
        // Student student = new Student();

        
       
    }
}

class NewBasic{

    // instence variable = inside the class but outside the methods.
    String name; // instance variable
    int roll; // instance variable
    // every object own copy of (name,roll)

    // Static variable = static variable associated with class, not object
    static String college = "GNIOT"; // static variable
    // for the multiple object same variable(single copy)

    // Final variable = after assign value in fial variable you can't change.
    final int MAX_AGE = 100;
    // MAX_AGE = 120; // ❌ Error

    // fot the constants
    static final double PI = 3.14159;

    // var age = 20; // ❌ var not use for class field only for local variable


    void local_ex(){

        // Local Variable = inside methods decleared variable
        int age = 21; // age -> local variable
        System.out.println("You are " + age + " years old!") ;

        // important: It is necessary to initialize local variables before using them.
        // int count;
        // System.out.println(count); // ❌ Error

        // var keyword (Modern java (after java 10)) = compiler infer type automatically
        var count = 21;         // the compiler will understand (int count = 21)
        var name_1 = "Ravi";    // the compiler will understand (String name_1 = "Ravi")
        var price = 99.5;       // the compiler will understand (double price = 99.5)

        System.out.println(count);
        System.out.println(name_1);
        System.out.println(price);

        // note:
        // var food; // not allowed, because should be assign always
    }
}

// Java Variables
// │
// ├── Local Variable
// │   └── Method/block ke andar
// │
// ├── Instance Variable
// │   └── Class ke andar, static ke bina
// │
// ├── Static Variable
// │   └── Class ke andar + static
// │
// ├── Final Variable
// │   └── Value reassign nahi kar sakte
// │
// └── Reference Variable
//     └── Objects/arrays ko refer karta hai

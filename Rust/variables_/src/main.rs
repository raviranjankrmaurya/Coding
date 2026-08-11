fn main() {

    // ============================================================
    // 1. VARIABLES
    // ============================================================

    // Variables:
    // - store a value in memory
    // - created using `let`
    // - immutable by default
    // - type can be inferred by Rust

    let age = 21;

    println!("Age: {}", age);


    // ============================================================
    // 2. MUTABLE VARIABLES
    // ============================================================

    // Mutable Variables:
    // - created using `let mut`
    // - value can be changed
    // - type can be inferred
    // - useful when data needs modification

    let mut marks = 80;

    marks = 90;

    println!("Marks: {}", marks);


    // ============================================================
    // 3. CONSTANTS
    // ============================================================

    // Constants:
    // - always immutable
    // - must have a type like (i32,u32,u64,i64,f32,f64)
    // - usually written in UPPER_CASE (variable name)
    // - value must be known at compile time (not assign {let variable or dynamic value} because const variable always constant)
    // - declared using `const`

    const PI: f64 = 3.14159;

    println!("PI: {}", PI);


    // ============================================================
    // 4. STATIC VARIABLES
    // ============================================================

    // Static:
    // - global variable with a fixed memory location
    // - exists for the entire program lifetime
    // - must have a type
    // - declared using `static`
    // - useful for global program data

    static OS_NAME: &str = "RaviranjanOS";

    println!("OS: {}", OS_NAME);


    // ============================================================
    // 5. STATIC MUT
    // ============================================================

    // Static mut:
    // - mutable global static variable
    // - value can be changed
    // - access requires `unsafe`
    // - generally avoid when safer alternatives exist

    // static mut COUNTER: i32 = 0;

    // unsafe {
    //     COUNTER += 1;
    // }


    // ============================================================
    // 6. SHADOWING
    // ============================================================

    // Shadowing:
    // - creates a new variable with the same name
    // - old variable is hidden
    // - can change the variable's type
    // - uses `let` again

    let x = 10;

    let x = 20;

    let x = "Rust";

    println!("x: {}", x);


    // ============================================================
    // 7. SIGNED INTEGER
    // ============================================================

    // Signed Integers:
    // - can store positive and negative numbers
    // - represented using `i`
    // - available as i8, i16, i32, i64, i128
    // - isize is platform-dependent

    let a: i8 = -10;
    let b: i16 = -1000;
    let c: i32 = -100000;
    let d: i64 = -1000000;
    let e: i128 = -100000000;

    println!("Signed: {} {} {} {} {}", a, b, c, d, e);


    // ============================================================
    // 8. UNSIGNED INTEGER
    // ============================================================

    // Unsigned Integers:
    // - store zero and positive numbers
    // - cannot store negative numbers
    // - represented using `u`
    // - available as u8, u16, u32, u64, u128
    // - usize is platform-dependent

    let a: u8 = 255;
    let b: u16 = 65000;
    let c: u32 = 100000;
    let d: u64 = 1000000;
    let e: u128 = 100000000;

    println!("Unsigned: {} {} {} {} {}", a, b, c, d, e);



    // ============================================================
    // 8.1 SIGNED INTEGER
    // ============================================================

    // Signed Integer:
    // - represented using `i`
    // - stores negative, zero and positive values
    // - one bit is used for the sign
    // - range = -(2^(bits - 1)) to 2^(bits - 1) - 1

    let a: i8 = -128;        // Range: -128 to 127
    let b: i16 = -32768;     // Range: -32,768 to 32,767
    let c: i32 = -2147483648; // Range: -2,147,483,648 to 2,147,483,647
    let d: i64 = -9223372036854775808;
    // Range: -9,223,372,036,854,775,808
    //      to  9,223,372,036,854,775,807

    let e: i128 = -170141183460469231731687303715884105728;
    // Range: -2^127 to 2^127 - 1

    let f: isize = -100;
    // Range depends on system architecture:
    // 32-bit system → -2^31 to 2^31 - 1
    // 64-bit system → -2^63 to 2^63 - 1



    // ============================================================
    // 8.2 UNSIGNED INTEGER
    // ============================================================

    // Unsigned Integer:
    // - represented using `u`
    // - stores only zero and positive values
    // - no sign bit is required
    // - range = 0 to 2^bits - 1

    let a: u8 = 255;
    // Range: 0 to 255

    let b: u16 = 65535;
    // Range: 0 to 65,535

    let c: u32 = 4294967295;
    // Range: 0 to 4,294,967,295

    let d: u64 = 18446744073709551615;
    // Range: 0 to 18,446,744,073,709,551,615

    let e: u128 = 340282366920938463463374607431768211455;
    // Range: 0 to 2^128 - 1

    let f: usize = 100;
    // Range depends on system architecture:
    // 32-bit system → 0 to 2^32 - 1
    // 64-bit system → 0 to 2^64 - 1


    // ============================================================
    // 9. isize
    // ============================================================

    // isize:
    // - signed integer type
    // - size depends on CPU architecture
    // - 64-bit on most 64-bit systems
    // - commonly used with memory-related operations

    let value: isize = -100;

    println!("isize: {}", value);


    // ============================================================
    // 10. usize
    // ============================================================

    // usize:
    // - unsigned integer type
    // - size depends on CPU architecture
    // - commonly used for indexes
    // - commonly used for collection sizes
    // - 64-bit on most 64-bit systems

    let index: usize = 10;

    println!("usize: {}", index);


    // ============================================================
    // 11. f32
    // ============================================================

    // f32:
    // - 32-bit floating-point number
    // - stores decimal values
    // - uses less memory than f64
    // - lower precision than f64

    let price: f32 = 99.99;

    println!("f32: {}", price);


    // ============================================================
    // 12. f64
    // ============================================================

    // f64:
    // - 64-bit floating-point number
    // - stores decimal values
    // - higher precision than f32
    // - default floating-point type in Rust

    let pi: f64 = 3.1415926535;

    println!("f64: {}", pi);


    // ============================================================
    // 13. BOOLEAN
    // ============================================================

    // Boolean:
    // - represents logical values
    // - has only two values
    // - values are `true` and `false`
    // - type is `bool`

    let is_student: bool = true;
    let is_admin: bool = false;

    println!("Student: {}", is_student);
    println!("Admin: {}", is_admin);


    // ============================================================
    // 14. CHAR
    // ============================================================

    // Character:
    // - represents one Unicode character
    // - type is `char`
    // - written using single quotes
    // - supports Unicode characters

    let letter: char = 'R';
    let hindi: char = 'अ';
    let emoji: char = '😀';

    println!("{} {} {}", letter, hindi, emoji);


    // ============================================================
    // 15. &str
    // ============================================================

    // String Slice:
    // - type is `&str`
    // - borrowed string data
    // - usually immutable
    // - string literals are commonly `&str`
    // - does not own the string data

    let name: &str = "Raviranjan";

    println!("Name: {}", name);


    // ============================================================
    // 16. String
    // ============================================================

    // String:
    // - owned string type
    // - stored on the heap
    // - growable and mutable
    // - contains valid UTF-8 data
    // - can be modified when declared `mut`

    let mut message = String::from("Hello");

    message.push_str(" Rust");

    println!("Message: {}", message);


    // ============================================================
    // 17. ARRAY
    // ============================================================

    // Array:
    // - stores multiple values
    // - all values must have the same type
    // - has a fixed size
    // - size is known at compile time
    // - syntax: [Type; Size]

    let numbers: [i32; 5] = [10, 20, 30, 40, 50];

    println!("Array: {:?}", numbers);
    println!("First: {}", numbers[0]);


    // ============================================================
    // 18. SLICE
    // ============================================================

    // Slice:
    // - borrowed view of a collection
    // - does not own the data
    // - length can vary at runtime
    // - written as `&[T]` for slices of T
    // - commonly used with arrays and vectors

    let slice: &[i32] = &numbers[1..4];

    println!("Slice: {:?}", slice);


    // ============================================================
    // 19. TUPLE
    // ============================================================

    // Tuple:
    // - groups multiple values together
    // - values can have different types
    // - fixed size
    // - accessed using `.0`, `.1`, `.2`, etc.

    let person: (&str, i32, f64) =
        ("Ravi", 21, 5.4);

    println!("Person: {:?}", person);

    println!("Name: {}", person.0);
    println!("Age: {}", person.1);


    // ============================================================
    // 20. UNIT TYPE
    // ============================================================

    // Unit Type:
    // - written as `()`
    // - has only one possible value
    // - represents no meaningful value
    // - functions with no return value return `()`

    let unit: () = ();

    println!("Unit: {:?}", unit);


    // ============================================================
    // 21. TYPE INFERENCE
    // ============================================================

    // Type Inference:
    // - Rust automatically determines the type
    // - explicit type is not always required
    // - compiler uses the value and context
    // - makes code shorter

    let number = 100;
    let decimal = 10.5;
    let active = true;
    let character = 'A';

    println!(
        "{} {} {} {}",
        number,
        decimal,
        active,
        character
    );


    // ============================================================
    // 22. TYPE ANNOTATION
    // ============================================================

    // Type Annotation:
    // - explicitly specifies a variable's type
    // - written after the variable name
    // - syntax: `let name: Type = value;`
    // - useful when Rust cannot infer the desired type

    let age: i32 = 21;
    let price: f64 = 99.5;

    println!("{} {}", age, price);


    // ============================================================
    // 23. TYPE CASTING
    // ============================================================

    // Type Casting:
    // - converts one numeric type into another
    // - uses the `as` keyword
    // - commonly used between integer and float types
    // - conversion rules depend on source and target types

    let integer: i32 = 100;

    let decimal: f64 = integer as f64;

    println!("Decimal: {}", decimal);


    // ============================================================
    // 24. TYPE ALIAS
    // ============================================================

    // Type Alias:
    // - gives another name to an existing type
    // - does not create a completely new type
    // - declared using `type`
    // - improves readability

    type UserId = u64;

    let id: UserId = 1001;

    println!("User ID: {}", id);


    // ============================================================
    // 25. STRUCT
    // ============================================================

    // Struct:
    // - creates a custom data type
    // - groups related data
    // - fields can have different types
    // - fields have names

    let user = User {
        name: String::from("Ravi"),
        age: 21,
    };

    println!("User: {:?}", user);


    // ============================================================
    // 26. ENUM
    // ============================================================

    // Enum:
    // - creates a type with multiple possible variants
    // - only one variant is active at a time
    // - variants can contain data
    // - declared using `enum`

    let direction = Direction::North;

    println!("Direction: {:?}", direction);


    // ============================================================
    // 27. OPTION<T>
    // ============================================================

    // Option<T>:
    // - represents an optional value
    // - `Some(value)` means value exists
    // - `None` means no value exists
    // - safer alternative to null
    // - T represents the contained type

    let age: Option<i32> = Some(21);

    let empty: Option<i32> = None;

    println!("Age: {:?}", age);
    println!("Empty: {:?}", empty);


    // ============================================================
    // 28. RESULT<T, E>
    // ============================================================

    // Result<T, E>:
    // - represents success or failure
    // - `Ok(value)` means success
    // - `Err(error)` means failure
    // - commonly used for error handling
    // - T = success type, E = error type

    let success: Result<i32, &str> = Ok(100);

    let failure: Result<i32, &str> =
        Err("Something went wrong");

    println!("Success: {:?}", success);
    println!("Failure: {:?}", failure);


    // ============================================================
    // 29. VECTOR
    // ============================================================

    // Vec<T>:
    // - growable array
    // - all elements have the same type
    // - stored on the heap
    // - size can change at runtime
    // - commonly used collection in Rust

    let mut numbers: Vec<i32> =
        vec![10, 20, 30];

    numbers.push(40);

    println!("Vector: {:?}", numbers);


    // ============================================================
    // 30. REFERENCE
    // ============================================================

    // Reference:
    // - written as `&T`
    // - borrows a value
    // - does not take ownership
    // - allows access to existing data

    let value = 100;

    let reference: &i32 = &value;

    println!("Reference: {}", reference);


    // ============================================================
    // 31. MUTABLE REFERENCE
    // ============================================================

    // Mutable Reference:
    // - written as `&mut T`
    // - borrows data mutably
    // - allows modification of borrowed data
    // - original variable must be mutable

    let mut value = 100;

    let reference: &mut i32 = &mut value;

    *reference += 50;

    println!("Value: {}", value);


    // ============================================================
    // 32. BOX<T>
    // ============================================================

    // Box<T>:
    // - smart pointer for heap allocation
    // - stores a value on the heap
    // - owns the heap data
    // - useful for recursive types and dynamic data

    let boxed: Box<i32> = Box::new(100);

    println!("Box: {}", boxed);


    // ============================================================
    // 33. RAW POINTER
    // ============================================================

    // Raw Pointer:
    // - `*const T` = immutable raw pointer
    // - `*mut T` = mutable raw pointer
    // - does not follow normal borrowing rules
    // - mainly used in low-level/unsafe programming

    let value = 100;

    let pointer: *const i32 = &value;

    println!("Pointer: {:?}", pointer);


    // ============================================================
    // 34. FUNCTION POINTER
    // ============================================================

    // Function Pointer:
    // - stores a function's callable address
    // - type is written as `fn(...) -> ...`
    // - can be passed to other functions
    // - useful for callbacks

    let operation: fn(i32, i32) -> i32 = add;

    println!("Result: {}", operation(10, 20));


    // ============================================================
    // 35. CLOSURE
    // ============================================================

    // Closure:
    // - anonymous function
    // - does not need a function name
    // - can capture variables from surrounding scope
    // - syntax uses `||`

    let square = |x: i32| x * x;

    println!("Square: {}", square(5));


    // ============================================================
    // 36. GENERIC
    // ============================================================

    // Generic:
    // - allows code to work with multiple types
    // - avoids writing the same code repeatedly
    // - `T` is commonly used as a generic type parameter
    // - checked at compile time

    let number = identity(100);
    let text = identity("Rust");

    println!("{} {}", number, text);


    // ============================================================
    // 37. TRAIT
    // ============================================================

    // Trait:
    // - defines shared behavior
    // - similar to an interface
    // - types can implement a trait
    // - used for abstraction and polymorphism

    let dog = Dog;

    dog.speak();


    // ============================================================
    // 38. TRAIT OBJECT
    // ============================================================

    // Trait Object:
    // - written using `dyn Trait`
    // - enables runtime polymorphism
    // - used when concrete type is not known directly
    // - commonly stored behind Box, &, or Arc

    let animal: Box<dyn Animal> =
        Box::new(Dog);

    animal.speak();


    // ============================================================
    // 39. Rc<T>
    // ============================================================

    // Rc<T>:
    // - Reference Counted smart pointer
    // - allows multiple ownership
    // - intended for single-threaded programs
    // - data is dropped when last Rc disappears

    use std::rc::Rc;

    let data = Rc::new(100);

    let data2 = Rc::clone(&data);

    println!("Rc: {} {}", data, data2);


    // ============================================================
    // 40. Arc<T>
    // ============================================================

    // Arc<T>:
    // - Atomic Reference Counted smart pointer
    // - allows multiple ownership
    // - safe to share between threads
    // - used in multi-threaded programs

    use std::sync::Arc;

    let shared = Arc::new(500);

    let shared2 = Arc::clone(&shared);

    println!("Arc: {} {}", shared, shared2);


    // ============================================================
    // 41. NEVER TYPE
    // ============================================================

    // Never Type:
    // - written as `!`
    // - represents something that never returns
    // - infinite loops can return `!`
    // - panic!() also has type `!`

    // fn never_returns() -> ! {
    //     loop {}
    // }


    // ============================================================
    // 42. LIFETIME
    // ============================================================

    // Lifetime:
    // - written using `'`
    // - describes how long a reference is valid
    // - prevents dangling references
    // - checked by the compiler
    // - commonly written as `'a`

    // fn longest<'a>(x: &'a str, y: &'a str) -> &'a str {
    //     if x.len() > y.len() {
    //         x
    //     } else {
    //         y
    //     }
    // }


    // ============================================================
    // 43. MEMORY SIZE
    // ============================================================

    // size_of:
    // - returns size of a type in bytes
    // - provided by std::mem
    // - useful for understanding memory usage

    println!(
        "i32 = {} bytes",
        std::mem::size_of::<i32>()
    );

    println!(
        "i64 = {} bytes",
        std::mem::size_of::<i64>()
    );

    println!(
        "usize = {} bytes",
        std::mem::size_of::<usize>()
    );

    println!(
        "char = {} bytes",
        std::mem::size_of::<char>()
    );
}


// ============================================================
// STATIC VARIABLE
// ============================================================

// Static:
// - global item
// - exists for entire program lifetime
// - has a fixed memory location
// - type must be specified
// - declared using `static`

static OS_NAME: &str = "RaviranjanOS";


// ============================================================
// STRUCT DEFINITION
// ============================================================

// Struct:
// - custom data type
// - groups related fields
// - fields can have different types
// - each field has a name

#[derive(Debug)]
struct User {
    name: String,
    age: i32,
}


// ============================================================
// ENUM DEFINITION
// ============================================================

// Enum:
// - custom type with multiple variants
// - represents one of several possible states
// - variants can contain data
// - declared using `enum`

#[derive(Debug)]
enum Direction {
    North,
    South,
    East,
    West,
}


// ============================================================
// FUNCTION
// ============================================================

// Function:
// - reusable block of code
// - declared using `fn`
// - can accept parameters
// - can return a value

fn add(a: i32, b: i32) -> i32 {
    a + b
}


// ============================================================
// GENERIC FUNCTION
// ============================================================

// Generic Function:
// - works with different types
// - uses type parameter
// - T represents an unknown type
// - compiler determines the actual type

fn identity<T>(value: T) -> T {
    value
}


// ============================================================
// TRAIT DEFINITION
// ============================================================

// Trait:
// - defines common behavior
// - similar to an interface
// - implemented by different types
// - methods define the behavior

trait Animal {
    fn speak(&self);
}


// ============================================================
// STRUCT + TRAIT IMPLEMENTATION
// ============================================================

// impl:
// - provides implementation for a type
// - can implement methods
// - can implement traits
// - connects behavior with a type

struct Dog;

impl Animal for Dog {

    fn speak(&self) {
        println!("Dog says: Woof!");
    }
}
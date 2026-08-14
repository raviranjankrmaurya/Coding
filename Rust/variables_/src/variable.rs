// globle variable
static C: i32 = 23; // it can be mutable when we use 'mut' keyword

// main function
fn main(){
    let a: i32 = 23;
    const PI: f32 = 3.14; // always give type of variable with const keyword, is's immutable
    println!("{a}");
    println!("Value of PI:{PI}");
    println!("{}",fatch_data());

    // Shadowing -> it's allow to create a new variable with same name 
    //              old variable is hidden, can change variable's types
    //              using let keyword, use also use previous value of
    //              variable.

    let cla = 2;
    println!("{}",cla);
    let cla = cla + 1; // here use previous value of cla
    println!("changed cla :{}",cla);

    let num: i32 = 23;
    println!("{}",num);

    let num = 34.45;
    println!("{}",num);

    let num = "345";
    println!("{}",num);
}
 // function
fn fatch_data() -> i32{
    C
}
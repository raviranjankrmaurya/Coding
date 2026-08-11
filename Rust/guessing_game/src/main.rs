use std::io;
use rand::RngExt;
fn main(){
    println!("Guess the number!");
    println!("Please enter your guess!");

    let mut guess: String = String::new();
    io::stdin().read_line(&mut guess).expect("input error");

     let rand_num: i32 = rand::rng().random_range(1..=100);

    println!("Screat number : {rand_num}");

    println!("You guessed! : {guess}");
}
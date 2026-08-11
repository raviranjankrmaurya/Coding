use std::io;
fn main() {
    println!("Guessing The Number!");

    let mut guess:String = String::new();
    io::stdin().read_line(&mut guess);
    println!("Guessed {guess}")

}

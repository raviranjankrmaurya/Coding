void main(){

   //final constants = Constants(); // constructor is called
   //print(constants.greeting); // static variable not access using instance of class 
  // print(constants.bye);

  print(Constants.greeting); // call static variable without creating instance of a class (constructor is not called)
  print(Constants.bye);
  print(Constants.giveMeSomeValue());
  print(Constants.age());

}
class Constants{

  int age1= 10;
  static int age2 = 20;

  Constants(){
    print('Constant constructor is called');
  }
  static String greeting = "Hello, How are you?";
  static String bye = 'Bye!';

  static int giveMeSomeValue() => 10;

  static int age(){
    // return age1; static methods could not access the noramal variable it's access the static variable becouse object is not created.
    return age2;
  }
}
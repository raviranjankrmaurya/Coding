void main(){
  // Inheritance (IS-A)
  // Object Oriented Programming(OOP)

  Car car = Car();
  print(car.noOfWheels);
  print(car.isEngineWorking);

  Vehicle car1 = Car(); // upcasting
  print((car1 as Car).noOfWheels); // as keyword
  //print((car1 as Truck)); // runTime error : because car1 not treat as truck

  dynamic val = 10; // runtime decide val is integer
  print(val);
  print((val as int).isEven); // val treat as integer

  final car3 = Car();
  car3.accelerate();
  print(car3.speed);


}

class Vehicle2{
  int speed = 12;
  bool isEngineWorking = true;
  bool isLightOn = false;

  void accelerate(){
    speed += 20;
  }
}

class Something{
  int speed = 10;
  void accelerate(){
    speed += 10;
  }
}

class Vehicle extends Something{
  //int speed = 20;
  bool isEngineWorking = false;
  bool isLightOn = true;

//   @override
//   void accelerate(){
//     speed += 30;
//   }
 }

class Car extends Vehicle{ // not extends at the same time two class like:-(class Car extends Vehicle,Vehicle2)
  int noOfWheels = 4;
  void printSomething(){
    print(noOfWheels);
  }
}

class Truck extends Vehicle{
  int noOfWheels = 8;
  void printSomething(){
    print(noOfWheels);
  }

}
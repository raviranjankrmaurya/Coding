void main(){

  final car = Car();
  print(car.noOfWheels);
  print(car.isEngineWorking);
  print(car.isLightOn);
  print(car.speed);

}

class OtherClass{
  int speed = 10;
  bool isEngineWorking = false;
  bool isLightOn = true;
  
}

class Vehicle{

  void accelerate(){
    print('accelerating vehicle');
  }
 }

class Car extends OtherClass implements Vehicle{ // not extends at the same time two class like:-(class Car extends Vehicle,Vehicle2) but implement multiple
  int noOfWheels = 4;
  void printSomething(){
    print(noOfWheels);
  }

  @override
  void accelerate(){
    print('accelerating Car');
  }
}

class Truck extends Vehicle{
  int noOfWheels = 8;
  void printSomething(){
    print(noOfWheels);
  }
}
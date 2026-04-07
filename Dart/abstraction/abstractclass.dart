void main(){

  final car = Car();
  car.accelerate();
  print('No of wheels in car : ${car.noOfWheels}');

  Truck truck = Truck();
  truck.accelerate();
}

abstract class Vehicle{ // anstract class can't be constructed

  int noOfWheels = 2;

  void accelerate();

 }

class Car implements Vehicle{ // if use implements keyword then compalsary to redefine the all members & methods of that class.

  @override
  int noOfWheels = 4;

  @override
  void accelerate(){
    print('Car is accelerated');
  }

}

class Truck extends Vehicle{ // if use extends keyword then redefine compalsary classes is abstract method or without definished method 

  @override
  void accelerate(){
    print('Truck is accelerated');
  }
  
}
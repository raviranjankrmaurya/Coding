void main() async{ // async for return future
  // Futures (Promises)

  print('line1');
   display();
  print('line3');
  
}

Future<void> display() async{
  Future.delayed(Duration(seconds: 5),()=> print('line2')); // it's wait for this line execution then go ahead
  // Future.delayed(Duration(seconds: 5),()=> print('line2')); // it's not wait for this line jump next line, after 2 second it will be executed 
}

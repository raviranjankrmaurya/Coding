void main(){

  // Exeption Handling

  print(10 / 3); // 3.3333
  print(10 ~/ 3); // 3

  print(10 / 0); // Infinity
  // print(10 ~/ 0); // IntegerDivisionByZeroException

  try{
    print(10 ~/ 0);
  }
  on FormatException catch(e){ // on is use a particular exceptions
    print(e);
  }
  catch(r){
    print(r);
    print('Some error occurred');
  }
  finally{
    print('Finally Block Executed'); // it's not matters try & catch block executed or not it's always executed.
  }

  print('Raj Sriwastav');

}
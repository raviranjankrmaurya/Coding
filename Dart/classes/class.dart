void main(){

  // print(Cookie()); // instance of Cookie class
  // print(Cookie().shape);
  // print(Cookie().size);
  // Cookie().baking();

  // final cookieCooling = Cookie().isCooling();
  // print(cookieCooling);

  // object creating

  final obj = Cookie(shape: 'Rectangle', size:56.9);
  // obj.baking();
  // obj.shape = 'Rect';
  // obj.size = 67.2;

  print(obj.shape);
  print(obj.size);
  print(obj._height); // same file accessable but not diffrent file accessadle
  print(obj._width); // same file accessable but not diffrent file accessadle

  

}

class Cookie{
  // variables

  // String? shape;
  // double? size;

  // Cookie(String shape, double size){
  //   this.shape = shape;
  //   this.size = size;
  //   print('cookie contructor is calling');
  //   barking();
  // }

  final String shape;
  final double size;

  // const Cookie({required this.shape, required this.size});
  //------------- or-------------↡⤵️

  Cookie({required this.shape, required this.size}){
  
    print('cookie contructor is calling');
    baking();
  }

  // Private Variables

  int _height = 4;
  int  _width = 5;

  // Getters
  int get height => _height;

  // methods

  int calculateSize(){
    return _height*_width;
  }

  void baking(){
    print('your cookie which is of the shape $shape and $size');
  }

  bool isCooling(){
    return false;
  }


}
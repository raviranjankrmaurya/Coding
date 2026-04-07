void main(){

  Demo obj = Demo('Rect', 6.9);
  print(obj.height);
  obj.setHeight = 23;
  print(obj.height);

}
class Demo{
  final String shape;
  final double size;
  Demo(this.shape, this.size){
    print('Demo class constructor');
  }

  // private variables
  int _height = 4;
  int _width = 5;

  // Getters

  int get height => _height;

  // Setter

  set setHeight(int h){
    _height = h;
  }

  // methods
  int  calculateSize(){
    return _height*_width;
  }

}
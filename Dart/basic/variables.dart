// <datatype> <variablename> value;
void main(){
    //Variable
    int firstValue = 89;
    String name = 'Amit';

    // print("ravi\n" * 8);
    print(firstValue);

    firstValue += 12;
    print(firstValue);

    print(name);

    name = name + ' Bind'; // not use
    print(name);
    // use interpolation for concetinate string
    name = '$name Ghazipur'; // for single word not use curlyBracket
    String len ='${name.length} words';
    print(len);  
    print(name);

    // mutiline string 
    String address = '''pari chowk , gautambhudh nagar 
    utter pardesh
    pin code = 201310''';

    print(address);

    String addr = 'pari chowk \n gautam budhnagar \n up';
    print(addr);

    // dynamic keyword

    dynamic greeting = 'hello, world (\$12)';
    print(greeting);
    print(greeting.runtimeType);

    greeting = 189;
    print(greeting);
    print(greeting.runtimeType);

    // var / final / const variableName = value;

    var someValue1 = 18; // mutable but same type
    // someValue1 = 'ravi'; ❌Error (only assign same type value that aasign first time)
    print('someValue $someValue1');
    someValue1 = 24;
    print('somValue after assign: $someValue1');

    final somevalue2 = 'sonu';
    const somevalue3= 'ujjwal';

    print('somvalue2: $somevalue2');
    print('somvalue3: $somevalue3');
    
    //somevalue2 = 'rohit'; // can be set once (inmutable)

    //final somevalue2 ='ee'; can't decleare again final same name variable

    //somevalue3 = 'amit'; // can't be assign a value

   // final -> it's runtime constant
   // const -> compile time constant

   final time = DateTime.now();
   // const time2= DateTime.now(); gives ❌error because DateTime.now() give value at runtime but const assign value at compiletime

   print(time);

   // Optional variable

  //  final? name = 'amit'; not allow nullable declaration
  //  const? name1 = 'amit'; not allow nullable declaration
  //  var? name3 = 'amit'; not allow nullable declaration

  // String first1 = null; it not assign null 
   String? first; // or String? first = null; it's by default null not need to assign null but depent upon you do assign or not.
   print(first);
   first = '23 amit. rohit';
   print(first);
   print(first.length);
   first = null;
    // print(first.length); length property not apply on null variable
   // print(first!.length); // can't read property of a variable .it telling not null but infact it's null

   print(first?.length); // it's telling if variable null then print null else print lengh of variable

   first = null;
   print(first?.length??0); // if firstVariable is null then print 0 else print variable length


}
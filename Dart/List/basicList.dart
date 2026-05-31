void main(){
  List<Object> list = [2,3,4,'hello',false,3.5];
  //List listSecond = [2,3,4,'hello',false,3.5];
  //var ss = [2,4,5,'df','f'];

  print(list);

  final rohitStudent = Student('Rohit',70);
  List<Student> students = [
    rohitStudent,
    Student('Raviranjan',23),
    Student('Amit',43)
    ];
  
  print(students);
  print(students[0].name);

  students.add(Student('Ujjwal',54));
  print(students);

  students.addAll([Student('RAJA',58),Student('Saurabh',62)]);
  print(students);

  students.insert(0,Student('Sonu',69),);
  print(students);

  students.remove(Student('Rohit',70)); // here create a another instance of Student('Rohit') & that remove, not actual
  students.remove(rohitStudent); // here actual remove, Student('Rohit') instance

  List<Student> filteredStudents = [];
  for(var student in students){
    if(student.marks >= 30){
      filteredStudents.add(student);
    }
  }
  //print(filteredStudents.reversed.toList()); // reversed returns Iterable Types

  print(filteredStudents);

  //  -------OR-------- (Easy⤵️)
  // final filteredStudent = students.where((student) => student.marks >= 30); // it's returns Iterable not list.
  // print(filteredStudent); // print Iterable
  // print(filteredStudent.toList()); // print List

  // final filteredStudentt = students.where((student) => student.marks >= 30).toList(); // returns list


  print(Collage());

}


class Student{
  final String name;
  final int marks;
  Student(this.name,this.marks);
  @override
  String toString() => ('Student: $name Marks: $marks');
}

class Collage{
  final int age =10;

  @override
  String toString() => ('Students in Collage');
}

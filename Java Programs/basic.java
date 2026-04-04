import java.util.Scanner;
class Arithmatic{
    void display(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your age:");
    int age = sc.nextInt();
    System.out.println("Your age is :" + age);

    

    sc.close();
    }
}

class basic {

    public static void main(String[] args) {
        System.out.println("Raviranjan");
        Arithmatic ss = new Arithmatic();
        ss.display();

    }
}
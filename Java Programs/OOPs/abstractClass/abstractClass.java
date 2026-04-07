abstract class abstract1{

    abstract void add();
    void minus(){
        System.out.println("minus method");
    }

}
class something extends abstract1{
    @Override
    void add(){
        System.out.println("add method in something class ");
    }
}

public class abstractClass{
    public static void main(String[] args) {
        something obj = new something();
        obj.add();
        obj.minus();
    }
}
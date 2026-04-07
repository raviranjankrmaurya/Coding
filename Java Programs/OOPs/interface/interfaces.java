interface interfaces1 {

    void add(); // BYdefault public, abstract
    default void minus(){
        System.out.println("minus mwthod in interface 1");
    }
}
class Test implements interfaces1{
    @Override
    public void add(){
        System.out.println("add in test class");
        minus();
    }
}

class interfaces{
    public static void main(String[] args) {
        Test obj = new Test();
        obj.add();
        
    }
}
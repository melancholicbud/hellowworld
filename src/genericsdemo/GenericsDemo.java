package genericsdemo;

public class GenericsDemo {
    public static void main(String[] args) {
        MyGenericsClass g = new MyGenericsClass();

        g.setMyVar(6);
        g.printValue();
    }
}

class MyGenericsClass {
    private Integer myVar;
    
}

package arraymethoddemo;

class MyClass {
    public void printFirstElement(int[] a) {
        System.out.println("The first element is " + a[0]);
    }

    public int[] returnArray() {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = i*2;
        }
        return a;
    }
}

public class ArrayMethodDemo {
    
}

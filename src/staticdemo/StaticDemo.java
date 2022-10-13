package staticdemo;

class MyClass {
    // non-static fields and methods
    public String message = "Hellow World";
    public void displayMessage() {
        System.out.println("Message = " + message);
    }

    // static fields and methods
    public static String greetings = "Good morning";
    public static void displayGreetings() {
        System.out.println("Greeting = " + greetings);
    }
}

public class StaticDemo {
}

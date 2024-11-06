//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Ainura", "Nusubalieva", 19);
        String[] lessons = {"Math Operations", "Conditional Statements", "Loop in Java", "Variables", "Array"};
        MyClass myClass1 = new MyClass(lessons, "manti");
        myClass.showFirstInfo();
        myClass1.showSecondInfo();
    }
}
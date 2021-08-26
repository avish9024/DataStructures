package javaInterviewQuestions.interfaces;

public class CloneableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableClass a = new CloneableClass(10, "Avinash");
        CloneableClass b = (CloneableClass) a.clone();
        System.out.println(b.i + " " + b.s);
    }
}

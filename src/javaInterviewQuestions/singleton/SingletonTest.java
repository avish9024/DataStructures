package javaInterviewQuestions.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        CustomSingleton s1 = CustomSingleton.getInstance();
        CustomSingleton s2 = CustomSingleton.getInstance();
        System.out.println(s1.s);
        System.out.println(s2.s);
    }
}

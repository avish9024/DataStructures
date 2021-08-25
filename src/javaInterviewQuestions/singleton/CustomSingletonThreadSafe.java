package javaInterviewQuestions.singleton;

public class CustomSingletonThreadSafe {
    // Static member holds only one instance of the CustomSingleton class
    private static CustomSingletonThreadSafe single_instance = new CustomSingletonThreadSafe();
    public String s;

    // CustomSingleton prevents any other class from instantiating
    private CustomSingletonThreadSafe() {
        s = "This is a singleton class";
    }

    // Providing Global point of access
    public static CustomSingletonThreadSafe getInstance() {
        return single_instance;
    }
}

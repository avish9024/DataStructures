package javaInterviewQuestions.singleton;

public class CustomSingleton {

    // Static member holds only one instance of the CustomSingleton class
    private static CustomSingleton single_instance = null;
    public String s;

    // CustomSingleton prevents any other class from instantiating
    private CustomSingleton() {
        s = "This is a singleton class";
    }

    // Providing Global point of access
    public static CustomSingleton getInstance() {
        if (single_instance == null) single_instance = new CustomSingleton();
        return single_instance;
    }
}
// The above code works properly in single threaded environment but when using in multi-threaded environment,
// it is possible that it may have multiple instances. To avoid this, we can instantiate instance of Singleton class
// at the time of loading only
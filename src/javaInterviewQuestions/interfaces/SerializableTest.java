package javaInterviewQuestions.interfaces;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableClass s = new SerializableClass(20, "Avinash");

        // Serializing
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        // De-serializing
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableClass s1 = (SerializableClass) ois.readObject();

        System.out.println(s1.i + " " + s1.s);
        oos.close();
        ois.close();
    }
}

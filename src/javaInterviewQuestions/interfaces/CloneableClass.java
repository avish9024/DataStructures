package javaInterviewQuestions.interfaces;

import java.io.ObjectInputStream;

public class CloneableClass implements Cloneable{
    int i;
    String s;

    public CloneableClass(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package javaInterviewQuestions.comparatorAndComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Avinash1", "31");
        Student s2 = new Student(2, "Avinash2", "22");
        Student s3 = new Student(3, "Avinash3", "24");
        Student s4 = new Student(4, "Avinash4", "69");
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.println(studentList);
        Collections.sort(studentList, new StudentAgeComparator());
        System.out.println(studentList);
    }
}

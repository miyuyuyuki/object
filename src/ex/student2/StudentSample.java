package ex.student2;

import Sample.enumSample.Gender;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentSample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(
                new Student("いのうえ", Gender.MEN, 98, 80, 100),
                new Student("うえの",Gender.WOMEN, 40, 50, 60),
                new Student("えんどう",Gender.MEN, 80, 20, 60),
                new Student("おおた",Gender.WOMEN, 70, 100, 40)
        ));
        System.out.println("課題1/n");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

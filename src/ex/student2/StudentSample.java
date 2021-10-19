package ex.student2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentSample {
    public static void main(String[] args) {

        List<Gender> students = new ArrayList<>();
        students.addAll(Arrays.asList(
                new Student("いのうえ","女", 98, 80, 100),
                new Student("うえの","男", 40, 50, 60),
                new Student("えんどう","女", 80, 20, 60),
                new Student("おおた","男", 70, 100, 40)
        ));

        for (Gender student : students) {
            System.out.println(student);
        }
    }
}

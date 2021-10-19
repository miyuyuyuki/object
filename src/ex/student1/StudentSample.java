package ex.student1;

public class StudentSample {
    public static void main(String[] args) {
        //設問1
        Student[] students = {
                new Student("あいざわ", "男", 60, 50, 70),
                new Student("いのうえ", "女", 98, 80, 100),
                new Student("うえの", "男", 40, 50, 60),
                new Student("えんどう", "女", 80, 20, 60),
                new Student("おおた", "男", 70, 100, 40)
        };

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(students[0].getName());
    }
}

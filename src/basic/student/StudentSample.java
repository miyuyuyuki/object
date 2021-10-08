package basic.student;

public class StudentSample {
    public static void main(String[] args) {
        Student student1 = new Student("あいざわ","男",1);
        Student student2 = new Student("田中","女",20);

        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1);

        System.out.println(student2.getName());
        System.out.println(student2.getGender());
        System.out.println(student2.getGrade());
        System.out.println(student2);

        //値のセット
        student1.setName("Jack");
        student1.setGrade(3);
        System.out.println(student1.getName());//Jack
        System.out.println(student1.getGender());//Jack
        System.out.println(student1.getGrade());//3
        System.out.println(student1);
    }
}

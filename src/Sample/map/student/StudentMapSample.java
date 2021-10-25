package Sample.map.student;

import Sample.enumSample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMapSample {
    public static void main(String[] args) {
        //クラスごとのマップ
        Map<String, List<Student>> studentGroupMap = new HashMap<>(40);
        //学生のリスト
        List<Student> studentList = new ArrayList<>(100);
        studentList.add(new Student("1-1", "やまだ", Gender.MEN, 60, 50, 70));
        studentList.add(new Student("1-1", "たけだ", Gender.WOMEN, 70, 100, 30));
        studentList.add(new Student("1-1", "かまだ", Gender.MEN, 100, 80, 90));
        studentList.add(new Student("1-2", "いいだ", Gender.MEN, 70, 90, 50));
        studentList.add(new Student("1-2", "やすだ", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-2", "わしだ", Gender.MEN, 0, 20, 80));
        studentList.add(new Student("1-3", "たかだ", Gender.WOMEN, 70, 100, 50));
        studentList.add(new Student("1-3", "かねだ", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-4", "さとう", Gender.MEN, 70, 90, 50));
        studentList.add(new Student("1-4", "すずき", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-4", "たかはし", Gender.MEN, 0, 20, 80));
        studentList.add(new Student("1-5", "ふるた", Gender.WOMEN, 70, 100, 50));
        studentList.add(new Student("1-5", "たがみ", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-5", "あいもの", Gender.WOMEN, 40, 40, 50));

        for (Student student : studentList) {
            //マップに存在するクラスの生徒が出現
            if (studentGroupMap.containsKey(student.getGroup())) {
                //リストに追加
                studentGroupMap.get(student.getGroup()).add(student);
            } else {
                //新しいキーを作成
                //空のリストをセット
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(),list);
            }
        }


        for(Map.Entry entry:studentGroupMap.entrySet()) {
            List<Student> list = (List<Student>) entry.getValue();
            for(Student student:list){
                System.out.println(student);
            }
//            1-1 やまだ 男 60 50 70 180 60.0
//            1-1 たけだ 女 70 100 30 200 66.7
//            1-1 かまだ 男 100 80 90 270 90.0
//            1-2 いいだ 男 70 90 50 210 70.0
//            1-2 やすだ 女 60 70 80 210 70.0
//            1-2 わしだ 男 0 20 80 100 33.3
//            1-3 たかだ 女 70 100 50 220 73.3
//            1-3 かねだ 女 60 70 80 210 70.0
//            1-4 さとう 男 70 90 50 210 70.0
//            1-4 すずき 女 60 70 80 210 70.0
//            1-4 たかはし 男 0 20 80 100 33.3
//            1-5 ふるた 女 70 100 50 220 73.3
//            1-5 たがみ 女 60 70 80 210 70.0
//            1-5 あいもの 女 40 40 50 130 43.3
        }

        for (Map.Entry entry : studentGroupMap.entrySet()) {
            double sumJap = 0,sumMath = 0,sumEng = 0;
            for (Student student:(List<Student>)entry.getValue()) {
                sumJap += student.getJap();
                sumMath += student.getMath();
                sumEng += student.getEng();
            }
            double aveJap = sumJap /((List<?>) entry.getValue()).size();
            double aveMath = sumMath /((List<?>) entry.getValue()).size();
            double aveEng = sumEng / ((List<?>) entry.getValue()).size();

            System.out.println(String.format("%s %.2f %.2f %.2f",entry.getKey(),aveJap,aveMath,aveEng));
//            1-1 76.67 76.67 63.33
//            1-2 43.33 60.00 70.00
//            1-3 65.00 85.00 65.00
//            1-4 43.33 60.00 70.00
//            1-5 56.67 70.00 60.00
        }
    }
}

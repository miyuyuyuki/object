package Sample.map.student;

import Sample.enumSample.Gender;

class Student {
    private String group;//学年とクラス 例 1-1
    private String name;
    private Gender gender;
    private int jap;
    private int math;
    private int eng;

    public Student(String group, String name, Gender gender, int jap, int math, int eng) {
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public int sum() {
        return jap + math +eng;
    }

    public double ave() {
        return sum() / 3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d %d %.1f"
                ,group,name,gender.getJpName(),jap,math,eng,sum(),ave());
    }
}

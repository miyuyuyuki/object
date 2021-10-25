package ex.student2;

import Sample.enumSample.Gender;

class Student {
    //フィールド
    private String name;//名前
    private Gender gender;//性別//Gender型
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    //コンストラクタ
    public Student(String name, Gender gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    //getter
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

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setJap(int jap) {
        this.jap = jap;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    //合計メソッドint sum()
    public int sum() {
        return jap + math + eng;
    }

    //平均メソッドdouble ave()
    public double ave(){
        return sum() /3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f", name,gender.getJpName(),jap,math,eng,sum(),ave());
    }

}

package basic.Sample.enumSample;

class Human {
    private String name;
    private  Gender gender;  //Stringじゃない！
    private  int age;

    public Human(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + gender.getJpName() +
                ", age=" + age +
                '}';
    }
}

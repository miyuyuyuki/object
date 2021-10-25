package sample.enumsample;

import Sample.enumSample.Gender;
import basic.human2.Human;

class HumanSample {
    public static void main(String[] args) {
        Human human = new Human("Tom",28);
        System.out.println(human);
        System.out.println(Gender.MEN.name());//列挙名
        System.out.println(Gender.WOMEN.getJpName());
        System.out.println(Gender.WOMEN.ordinal());//列挙順（０から）

    }
}

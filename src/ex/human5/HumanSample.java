package ex.human5;

import basic.human5.IfSayHello;//<IfSayHello>で自動入力

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanSample {
    public static void main(String[] args) {

        List<IfSayHello> humans = new ArrayList<>();
        humans.addAll(Arrays.asList(
                new Chinese("習"),
                new English("Tom"),
                new French("Andre"),
                new Japanese("太郎"),
                new Korean("金")
        ));

        for (IfSayHello human:humans) {
            human.sayHello();
        }

    }
}

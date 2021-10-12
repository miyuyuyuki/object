package basic.human4;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        Human[] humans = {
                new Japanese("ひろし"),
                new Chinese("王"),
                new English("Jim"),
                new French("Andrée")
        };

        for (Human human:humans) {
            human.sayHello();
        }


        /*/*
        Human tom = new Human("Tom");
        tom.sayHello();
        //Japanese hiroshi = new Japanese("ひろし");    //継承により
        Human hiroshi = new Japanese("ひろし");
        hiroshi.sayHello();

        Human kim = new Korean("金");
        kim.sayHello();

        Human ma = new Chinese("馬");
        ma.sayHello();*/
    }
}

package basic.human4;

//日本人クラス
class Japanese extends Human {
    //コンストラクタ
    public Japanese(String name) {
        super(name);//Human(name)と同じ 継承（スーパークラス）を呼び出している
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }

}

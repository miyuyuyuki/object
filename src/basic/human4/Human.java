package basic.human4;

//抽象//継承
abstract class Human {
    //フィールド
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    //抽象メソッド
    //戻り値とメソッド名のみ定義
    abstract void sayHello();
}

package basic.human5;

class Chinese implements IfSayHello {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        //super.sayHello();
        System.out.println("你好!我叫" + name + ".");
    }
}

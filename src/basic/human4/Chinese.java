package basic.human4;

class Chinese extends Human {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        //super.sayHello();
        System.out.println("你好!我叫" + name + ".");
    }
}

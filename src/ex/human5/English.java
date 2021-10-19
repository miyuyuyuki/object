package ex.human5;

import basic.human5.IfSayHello;

class English implements IfSayHello {
    private String name;

    public English(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        //super.sayHello();
        System.out.println("Hello!I'm" + name + ".");
    }
}

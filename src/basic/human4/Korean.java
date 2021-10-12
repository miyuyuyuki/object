package basic.human4;

class Korean extends Human {
    public Korean(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요!저는" + name + "이예요.");
    }
}

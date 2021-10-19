package basic.human5;

class Korean implements IfSayHello {
    private String name;
    public Korean(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요!저는" + name + "이예요.");
    }
}

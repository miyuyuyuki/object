package ex.student2;

public enum Gender {
    MEN("男"),
    WOMEN("女");

    private String jpName;

    Gender(String jpName) {
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}

package Sample.enumSample;

public enum Gender {
    MEN("男"),
    WOMEN("女");

    //フィールドの追加（コンストラクタ,getter)
    private String jpName;

    Gender(String jpName){
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}

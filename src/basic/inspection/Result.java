package basic.inspection;

class Result {
    private String id;//検査を受けた人のID
    private String name;//検査を受けた人の名前
    private String dateTime;//検査日時
    private double bT;//体温
    private int pulse;//脈拍
    private int sBP;//収縮期血圧
    private int dBP;//拡張期血圧


    public Result(String id, String name, String dateTime, double bT, int pulse, int sBP, int dBP) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.bT = bT;
        this.pulse = pulse;
        this.sBP = sBP;
        this.dBP = dBP;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public double getbT() {
        return bT;
    }

    public void setbT(double bT) {
        this.bT = bT;
    }
    public int getPulse() {
        return pulse;
    }
    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    public int getsBP() {
        return sBP;
    }
    public void setsBP(int sBP) {
        this.sBP = sBP;
    }
    public int getdBP() {
        return dBP;
    }
    public void setdBP(int dBP) {
        this.dBP = dBP;
    }

    //平均血圧を求めるメソッド
    public double getMBP() {
        return ((double)dBP +（(double)sBP-(double) dBP）/3.0) ;
    }

    //
    @Override
    public String toString() {
        return id + '\'' +
                name + '\'' +
                dateTime + '\'' +
                bT +
                pulse +
                sBP +
                dBP
                ;
    }
}

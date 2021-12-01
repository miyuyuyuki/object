package ex.inventory;

class PersonalComputer {
    private String userName;//使用者名
    private int pcNo;//PC番号
    private int storageNo;//倉庫番号
    private int pcPrice;//
    private int bit;//
    private String OS;//

    PersonalComputer(String userName, int pcNo, int storageNo, int pcPrice, int bit, String OS) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.pcPrice = pcPrice;
        this.bit = bit;
        this.OS = OS;
    }

    public String getUserName() {
        return userName;
    }

    public int getPcNo() {
        return pcNo;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getPcPrice() {
        return pcPrice;
    }

    public int getBit() {
        return bit;
    }

    public String getOS() {
        return OS;
    }
}

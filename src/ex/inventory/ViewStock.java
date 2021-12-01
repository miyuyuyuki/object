package ex.inventory;


import java.util.*;

class ViewStock {
    public static void main(String[] args) {
        List<PersonalComputer> pcList= new ArrayList<>(15);

        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ",1,1,40000,Constants2.BIT_64,Constants2.WINDOWS_10),
                new PersonalComputer("いけだ",2,1,90000,Constants2.BIT_64,Constants2.WINDOWS_11),
                new PersonalComputer("いのうえ",3,1,80000,Constants2.BIT_64,Constants2.WINDOWS_11),
                new PersonalComputer("たむら",4,2,120000,Constants2.BIT_32,Constants2.MAC),
                new PersonalComputer("わだ",5,2,30000,Constants2.BIT_32,Constants2.WINDOWS_10),
                new PersonalComputer("くどう",6,2,150000,Constants2.BIT_64,Constants2.MAC),
                new PersonalComputer("さらど",7,3,40000,Constants2.BIT_32,Constants2.WINDOWS_10),
                new PersonalComputer("あいざわ",8,3,70000,Constants2.BIT_32,Constants2.MAC)
        ));

        //storagePriceMapの初期化
        // key:storageNo(倉庫番号)　値：pcPrice(金額)　
        Map<Integer,ArrayList<Integer>> storagePriceMap = new HashMap<>();

        //key:storageNo
        //value:pcPrice
        for (PersonalComputer pc:pcList) {  //pcListから繰り返し処理を行い値を取り出す
            int storageNo = pc.getStorageNo();  //複数回行うので変数として切り分けしている
            if (!storagePriceMap.containsKey(storageNo)) {  //Mapの中に倉庫番号がkeyとして含まれていなかったら
                storagePriceMap.put(storageNo,new ArrayList<>());   //Listに追加する
            }
            storagePriceMap.get(storageNo).add(pc.getPcPrice());    //
        }

        System.out.println("//storagePriceMapの中身をチェック");
        for(Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }


        //保管倉庫ごとの在庫内容を抽出したいのでMapにする
        //OsMapの初期化
        Map<Integer,ArrayList<String>> osMap = new HashMap<>();

        //Key:StorageNo
        //Value:OS
        for (PersonalComputer pc:pcList) {
            int storageNo = pc.getStorageNo();
            if (!osMap.containsKey(storageNo)) {
                osMap.put(storageNo,new ArrayList<>());
            }
            osMap.get(storageNo).add(pc.getOS());
        }

        System.out.println("//osMapの中身をチェック");
        for(Map.Entry entry : osMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }


    }

}

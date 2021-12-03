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

        //storagePriceMapからさらに計算を行う
        //倉庫ごとのPC合計金額を計算して表示
        System.out.println("//倉庫ごとの合計金額");
        for(Map.Entry entry: storagePriceMap.entrySet()){
            double sum = 0;//合計を入れる変数を定義する
            for (Integer i :(List<Integer>)entry.getValue()){
                sum += i;
            }
            System.out.println("倉庫番号" + entry.getKey());
            System.out.println("合計金額" + sum + "円");
        }
        //倉庫ごとの合計金額
//        倉庫番号1
//        合計金額210000.0円
//                倉庫番号2
//        合計金額300000.0円
//                倉庫番号3
//        合計金額110000.0円

        //合計台数を表示
        System.out.println("//倉庫ごとの合計台数");
        for (Map.Entry entry: storagePriceMap.entrySet()){
            int cnt = ((List)entry.getValue()).size();//合計台数
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("合計台数" + cnt + "台");
        }
        //倉庫ごとの合計台数
//        倉庫番号1:
//        合計台数3台
//        倉庫番号2:
//        合計台数3台
//        倉庫番号3:
//        合計台数2台

        //倉庫別に1台ごとの平均金額を表示
        System.out.println("//倉庫内の1台ごとの平均金額");
        for (Map.Entry entry : storagePriceMap.entrySet()){
            double sum = 0;//合計
            int cnt = ((List)entry.getValue()).size();//合計台数
            double avg = sum / (int) cnt;
            for (Integer i :(List<Integer>)entry.getValue()){
                sum += i;
            }
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("平均金額"+ avg + "円");
        }
    }

}

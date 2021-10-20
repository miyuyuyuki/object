package basic.Sample;

import java.util.HashMap;
import java.util.Map;

class HashMapSample {
    public static void main(String[] args) {
        //宣言
        Map<String,String> map = new HashMap<>(32);//12件以下ならOK
        //要素の追加
        map.put("apple","りんご");
        map.put("pineapple","パイナップル");
        map.put("orange","オレンジ");
        //表示
        System.out.println(map);
        //値の取得
        System.out.println(map.get("apple"));//りんご
        //キーの集合
        System.out.println(map.keySet());//[orange, apple, pineapple]
        //値の集合の取得
        System.out.println(map.values());//[オレンジ, りんご, パイナップル]
        //キーと値を取得
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //orange:オレンジ
        //apple:りんご
        //pineapple:パイナップル

        //要素の削除
        System.out.println(map.remove("orange"));//オレンジ（戻り値として表示される）
        //要素の変更
        System.out.println(map.put("apple", "リンゴ"));//りんご
        //表示
        System.out.println(map);//{apple=リンゴ, pineapple=パイナップル}
        //
        String searchWord = "orange";
        if(map.containsKey(searchWord)) {
            System.out.println(map.get(searchWord));
        } else {
            System.out.println("Not find:" + searchWord);
        }
    }
}

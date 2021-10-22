package basic.Sample;

import java.util.*;

class HashSetSample {
    public static void main(String[] args) {
        //宣言
        Set<Integer> integerSet = new HashSet<>();
        //追加
        integerSet.add(10);
        integerSet.addAll(Arrays.asList(20,30));
        System.out.println(integerSet);//10 20 30
        //削除
        integerSet.remove(20);
        System.out.println(integerSet);//10 30
        //要素数
        System.out.println(integerSet.size());//2
        //空かどうか？
        System.out.println(integerSet.isEmpty());//false
        //値の検索
        System.out.println(integerSet.contains(20));//false
        //ArrayListからの変換
        List<Integer> integerList = new ArrayList<>(Arrays.asList(3, 9, 1, 6, 1));
        System.out.println("ArrayList:"+integerList);//ArrayList:[3, 9, 1, 6, 1]
        Set<Integer> integerLinkedHashSet = new LinkedHashSet<>(integerList);//変換
        System.out.println("LinkedHashSet:"+integerLinkedHashSet);//追加順
        // LinkedHashSet:[3, 9, 1, 6]
        Set<Integer> integerTreeSet = new TreeSet<>(integerList);//変換
        System.out.println("TreeSet:"+integerTreeSet);//昇順になる
        //TreeSet:[1, 3, 6, 9]
    }

}

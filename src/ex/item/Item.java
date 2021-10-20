package ex.item;

import java.util.Objects;

class Item {
    private int id;//商品ID
    private String name;//商品名
    private int price;//価格

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d",
                id,name,price);
    }
}

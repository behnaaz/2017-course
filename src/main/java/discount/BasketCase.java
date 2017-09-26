package discount;

import java.util.List;

public class BasketCase {

    private double price;
    private List<Item> items;

    public BasketCase(List<Item> items) {
        this.items = items;
        sum();
    }

    private void sum() {
        for(Item item : items) {
            price += item.totalPrice();
        }

    }

    public void reduce(double amountToReduce) {
        this.price -= amountToReduce;
    }

    public double getPrice() {
        return price;
    }

    public int qtyItems() {
        int qtd = 0;
        for(Item item : items) {
            qtd+= item.getQty();
        }
        return qtd;
    }

    public boolean has(String product) {
        for(Item item : items) {
            if(item.getName().equals(product)) return true;
        }

        return false;
    }

}
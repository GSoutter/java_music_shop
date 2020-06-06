import behaviours.ISell;
import instruments.Horn;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }


    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        this.stock.remove(item);
    }

    public int totalStockProfitValue() {
        int total = 0;
        for(ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}

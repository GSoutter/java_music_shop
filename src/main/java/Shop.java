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
}

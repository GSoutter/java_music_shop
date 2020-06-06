import behaviours.ISell;
import enums_categories.InstrumentType;
import instruments.Accessory;
import instruments.Horn;
import instruments.Instrument;

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

    public ArrayList<Accessory> getAccessories(Instrument instrument) {
        ArrayList<Accessory> accessories = new ArrayList<Accessory>();

        for(ISell item : this.stock){
            if (item instanceof Accessory){
                for (InstrumentType type : ((Accessory) item).getUseTag()){
                    if (type == instrument.getType()){
                        accessories.add((Accessory) item);
                        break;
                    }
                }
            }
        }
        return accessories;

    }
}

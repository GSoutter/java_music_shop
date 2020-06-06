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
                ArrayList<InstrumentType> tags = ((Accessory) item).getUseTag();
                if (tags.contains(instrument.getType())){
                    accessories.add((Accessory) item);
                }
//
            }
        }
        return accessories;

    }

    public ArrayList<Instrument> getOtherInstruments(Instrument instrument) {
        ArrayList<Instrument> instruments = new ArrayList<Instrument>();

        for(ISell item : this.stock){
            if (item instanceof Instrument){
                if (((Instrument) item).getType() == instrument.getType()){
                    instruments.add((Instrument) item);
                }
            }
        }
        return instruments;

    }
}

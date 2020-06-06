package instruments;

import behaviours.ISell;
import enums_categories.InstrumentType;

import java.util.ArrayList;

public class Accessory implements ISell {

    private String name;
    private double buyPrice;
    private double sellPrice;
    private ArrayList<InstrumentType> useTag;

    public Accessory(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.useTag = new ArrayList<InstrumentType>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public ArrayList<InstrumentType> getUseTag() {
        return useTag;
    }

    public void addUseTag(InstrumentType tag){
        this.useTag.add(tag);
    }
}

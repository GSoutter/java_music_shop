package instruments;

import enums_categories.InstrumentType;
import enums_categories.Material;

public class Horn extends Instrument{

    private int numberOfValves;

    public Horn(String name,
                 String brand,
                 Material material,
                 String colour,
                 boolean electric,
                 double buyPrice,
                 double sellPrice,
                 int numberOfValves) {
        super(name, brand, material, colour, InstrumentType.KEYBOARD, electric, buyPrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
    public String play() {
        return "abide with me";
    }
}

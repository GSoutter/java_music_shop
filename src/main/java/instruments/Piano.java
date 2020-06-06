package instruments;

import enums_categories.InstrumentType;
import enums_categories.Material;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(String name,
                  String brand,
                  Material material,
                  String colour,
                  boolean electric,
                  double buyPrice,
                  double sellPrice,
                  int numberOfKeys) {
        super(name, brand, material, colour, InstrumentType.KEYBOARD, electric, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String play() {
        return "oh when the saints";
    }
}

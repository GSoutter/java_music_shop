package instruments;

import enums_categories.InstrumentType;
import enums_categories.Material;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String name,
                  String brand,
                  Material material,
                  String colour,
                  InstrumentType type,
                  boolean electric,
                  double buyPrice,
                  double sellPrice,
                  int numberOfStrings) {
        super(name, brand, material, colour, type, electric, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}

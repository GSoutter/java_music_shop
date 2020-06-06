package instruments;

import enums_categories.InstrumentType;
import enums_categories.Material;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String name,
                  String brand,
                  Material material,
                  String colour,
                  boolean electric,
                  double buyPrice,
                  double sellPrice,
                  int numberOfStrings) {
        super(name, brand, material, colour, InstrumentType.STRINGS, electric, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "So anyway, here's Wonderwall";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}

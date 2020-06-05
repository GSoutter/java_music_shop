package instruments;

import enums_categories.InstrumentType;
import enums_categories.Material;

public abstract class Instrument {

    private String name;
    private String brand;
    private Material material;
    private String colour;
    private InstrumentType type;
    private boolean electric;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String name, String brand, Material material, String colour, InstrumentType type, boolean electric, double buyPrice, double sellPrice) {
        this.name = name;
        this.brand = brand;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.electric = electric;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Material getMaterial() {
        return material;
    }

    public String getMaterialName() {
        return material.getName();
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getTypeName() {
        return type.getName();
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
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
}

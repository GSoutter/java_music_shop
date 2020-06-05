package enums_categories;

public enum InstrumentType {
    WOODWIND("Woodwind"),
    STRINGS("Strings"),
    BRASS("Brass"),
    KEYBOARD("Keyboard"),
    SYNTHESISER("Synthesiser"),
    PERCUSSION("Percussion");



    private final String name;

    InstrumentType(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

package enums_categories;

public enum Material {
    WOOD("Wood"),
    METAL("Metal"),
    PLASTIC("Plastic");


    private final String name;

    Material(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

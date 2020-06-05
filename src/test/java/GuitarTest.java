import enums_categories.InstrumentType;
import enums_categories.Material;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("telecaster",
                "fender",
                Material.WOOD,
                "sunburst orange",
                InstrumentType.STRINGS,
                true,
                60,
                120,
                6);

    }

    @Test
    public void canGetName(){
        assertEquals("telecaster", guitar.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("fender", guitar.getBrand());
    }
    @Test
    public void canGetMaterial(){
        assertEquals(Material.WOOD, guitar.getMaterial());
    }
    @Test
    public void canGetMaterialName(){
        assertEquals("Wood", guitar.getMaterialName());
    }
    @Test
    public void canGetColour(){
        assertEquals("sunburst orange", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }
    @Test
    public void canGetInstrumentTypeName(){
        assertEquals("Strings", guitar.getTypeName());
    }
    @Test
    public void isElectricType(){
        assertEquals(true, guitar.isElectric());
    }
    @Test
    public void canGetBuyPrice(){
        assertEquals(60, guitar.getBuyPrice(), 0.01);
    }
    @Test
    public void canGetSellPrice(){
        assertEquals(120, guitar.getSellPrice(), 0.01);
    }
    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }




}

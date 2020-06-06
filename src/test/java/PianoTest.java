import enums_categories.InstrumentType;
import enums_categories.Material;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Imperial Grand",
                "Bosendorfer",
                Material.WOOD,
                "mahogany",
                false,
                5000,
                10000,
                97);

    }

    @Test
    public void canGetName(){
        assertEquals("Imperial Grand", piano.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Bosendorfer", piano.getBrand());
    }
    @Test
    public void canGetMaterial(){
        assertEquals(Material.WOOD, piano.getMaterial());
    }
    @Test
    public void canGetMaterialName(){
        assertEquals("Wood", piano.getMaterialName());
    }
    @Test
    public void canGetColour(){
        assertEquals("mahogany", piano.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }
    @Test
    public void canGetInstrumentTypeName(){
        assertEquals("Keyboard", piano.getTypeName());
    }
    @Test
    public void isElectricType(){
        assertEquals(false, piano.isElectric());
    }
    @Test
    public void canGetBuyPrice(){
        assertEquals(5000, piano.getBuyPrice(), 0.01);
    }
    @Test
    public void canGetSellPrice(){
        assertEquals(10000, piano.getSellPrice(), 0.01);
    }
    @Test
    public void canGetNumberOfKeys(){
        assertEquals(97, piano.getNumberOfKeys());
    }


    @Test
    public void canSetName(){
        piano.setName("les paul");
        assertEquals("les paul", piano.getName());
    }

    @Test
    public void canSetBrand(){
        piano.setBrand("Epiphone");

        assertEquals("Epiphone", piano.getBrand());
    }
    @Test
    public void canSetMaterial(){
        piano.setMaterial(Material.METAL);
        assertEquals(Material.METAL, piano.getMaterial());
    }
    @Test
    public void canSetColour(){
        piano.setColour("sunburst red");
        assertEquals("sunburst red", piano.getColour());
    }

    @Test
    public void canSetInstrumentType(){
        piano.setType(InstrumentType.STRINGS);
        assertEquals(InstrumentType.STRINGS, piano.getType());
    }
    @Test
    public void canSetElectricType(){
        piano.setElectric(true);
        assertEquals(true, piano.isElectric());
    }
    @Test
    public void canSetBuyPrice(){
        piano.setBuyPrice(70);
        assertEquals(70, piano.getBuyPrice(), 0.01);
    }
    @Test
    public void canSetSellPrice(){
        piano.setSellPrice(130);
        assertEquals(130, piano.getSellPrice(), 0.01);
    }
    @Test
    public void canSetNumberOfStrings(){
        piano.setNumberOfKeys(12);
        assertEquals(12, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("oh when the saints", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5000, piano.calculateMarkup(), 0.01);
    }


}

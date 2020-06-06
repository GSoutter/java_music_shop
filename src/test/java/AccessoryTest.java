import enums_categories.InstrumentType;
import instruments.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    private Accessory neckstrap;

    @Before
    public void before(){
        neckstrap = new Accessory("Padded Neckstrap", 10, 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Padded Neckstrap", neckstrap.getName());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10, neckstrap.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(20, neckstrap.getSellPrice(), 0.01);
    }
    @Test
    public void canGetUseTagEmpty(){
        assertEquals(0, neckstrap.getUseTag().size(), 0.01);
    }
    @Test
    public void canSetName(){
        neckstrap.setName("Necko");
        assertEquals("Necko", neckstrap.getName());
    }

    @Test
    public void canSetBuyPrice(){
        neckstrap.setBuyPrice(11);
        assertEquals(11, neckstrap.getBuyPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        neckstrap.setSellPrice(220);
        assertEquals(220, neckstrap.getSellPrice(), 0.01);
    }
    @Test
    public void canAddUseTag(){
        neckstrap.addUseTag(InstrumentType.STRINGS);
        neckstrap.addUseTag(InstrumentType.WOODWIND);
        assertEquals(2, neckstrap.getUseTag().size(), 0.01);
    }
}

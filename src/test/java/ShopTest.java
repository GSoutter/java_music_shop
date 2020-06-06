import enums_categories.InstrumentType;
import enums_categories.Material;
import instruments.Accessory;
import instruments.Guitar;
import instruments.Horn;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Guitar guitar;
    private Piano piano;
    private Horn horn;
    private Accessory neckstrap;
    private Accessory stringReplacement;
    private Shop shop;





    @Before
    public void before(){
        guitar = new Guitar("telecaster",
                "fender",
                Material.WOOD,
                "sunburst orange",
                true,
                60,
                120,
                6);
        piano = new Piano("Imperial Grand",
                "Bosendorfer",
                Material.WOOD,
                "mahogany",
                false,
                5000,
                10000,
                97);
        horn = new Horn("Tenor Concerto",
                "Finke",
                Material.METAL,
                "silver",
                true,
                150,
                250,
                3);
        neckstrap = new Accessory("Padded Neckstrap", 10, 20);
        stringReplacement = new Accessory("Guitar Strings", 5, 17);
        stringReplacement.addUseTag(InstrumentType.STRINGS);
        neckstrap.addUseTag(InstrumentType.STRINGS);
        neckstrap.addUseTag(InstrumentType.WOODWIND);

        shop = new Shop();

    }

    @Test
    public void canGetStockEmpty(){
        assertEquals(0, shop.getStock().size());
    }


}

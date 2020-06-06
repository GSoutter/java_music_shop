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

    @Test
    public void canAddStock(){
        shop.addItem(horn);
        shop.addItem(horn);
        shop.addItem(piano);
        shop.addItem(neckstrap);
        assertEquals(4, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.addItem(horn);
        shop.addItem(horn);
        shop.addItem(piano);
        shop.addItem(neckstrap);
        shop.removeStock(piano);
        shop.removeStock(horn);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canGetTotalProfitValue(){
        shop.addItem(horn);
        shop.addItem(horn);
        shop.addItem(piano);
        shop.addItem(neckstrap);
        assertEquals(5210, shop.totalStockProfitValue());
    }

    @Test
    public void canGetAccessoriesToInstrument() {
        shop.addItem(horn);
        shop.addItem(piano);
        shop.addItem(guitar);
        shop.addItem(neckstrap);
        shop.addItem(stringReplacement);
        assertEquals(1, shop.getAccessories(horn).size());
        assertEquals(2, shop.getAccessories(guitar).size());
    }
//    @Test
//    public void canGetOtherInstrumentsOfSameType() {
//        shop.addItem(horn);
//        shop.addItem(horn);
//        shop.addItem(piano);
//        shop.addItem(piano);
//        shop.addItem(piano);
//        shop.addItem(guitar);
//        shop.addItem(neckstrap);
//        shop.addItem(stringReplacement);
//        assertEquals(1, shop.getAccessories(horn).size());
//        assertEquals(2, shop.getAccessories(guitar).size());
//    }
}

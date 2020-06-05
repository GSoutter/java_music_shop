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

}

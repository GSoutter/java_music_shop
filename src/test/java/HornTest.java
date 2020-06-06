import enums_categories.Material;
import instruments.Guitar;
import instruments.Horn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HornTest {


    private Horn horn;

    @Before
    public void before(){
        horn = new Horn("Tenor Concerto",
                "Finke",
                Material.METAL,
                "silver",
                true,
                150,
                250,
                3);

    }


    @Test
    public void canGetNumberOfValves(){
        assertEquals(3, horn.getNumberOfValves());
    }
    @Test
    public void canSetNumberOfValves(){
        horn.setNumberOfValves(4);
        assertEquals(4, horn.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("abide with me", horn.play());
    }
}

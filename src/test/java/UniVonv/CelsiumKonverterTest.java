package UniVonv;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
public class CelsiumKonverterTest {
    CelsiumKonverter converter = new CelsiumKonverter();

    @Test
    public void toSI() throws Exception {
        assertEquals(274.15, converter.toSI(1), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(1, converter.fromSI(274.15), 0.00001);

    }

    @Test
    public void getName() throws Exception {
        assertEquals("Celsium", converter.getName());

    }

}
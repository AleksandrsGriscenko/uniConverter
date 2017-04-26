package UniVonv;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
public class FehrengateKonverterTest {
    FehrengateKonverter  converter = new  FehrengateKonverter();

    @Test
    public void toSI() throws Exception {
        assertEquals(100, converter.toSI(310.927778), 0.00001);

    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(-279.67, converter.fromSI(100), 0.00001);

    }

    @Test
    public void getName() throws Exception {
        assertEquals("Fahrengate", converter.getName());

    }

}
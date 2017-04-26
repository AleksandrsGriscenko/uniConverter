package UniVonv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */

@RunWith(Parameterized.class)
public class CelsiumKonverterTest {
    CelsiumKonverter converter = new CelsiumKonverter();

    @Parameterized.Parameter(0)
    public double srcCel;
    @Parameterized.Parameter(1)
    public double trgCel;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 274.15},
                {20, 293.15},
                {30, 303.15}
        });
    }


    @Test
    public void toSI() throws Exception {
        assertEquals(trgCel, converter.toSI(srcCel), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(srcCel, converter.fromSI(trgCel), 0.00001);

    }

    @Test
    public void getName() throws Exception {
        assertEquals("Celsium", converter.getName());

    }

}
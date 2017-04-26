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
public class FehrengateKonverterTest {
    FehrengateKonverter  converter = new  FehrengateKonverter();

    @Parameterized.Parameter(0)
    public double srcFar;
    @Parameterized.Parameter(1)
    public double trgFar;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1., 255.927778},
                {20, 266.483333},
                {30, 272.038889}
        });
    }

    @Test
    public void toSI() throws Exception {
        assertEquals(trgFar, converter.toSI(srcFar), 0.00001);

    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(srcFar, converter.fromSI(trgFar), 0.00001);

    }

    @Test
    public void getName() throws Exception {
        assertEquals("Fahrengate", converter.getName());

    }

}
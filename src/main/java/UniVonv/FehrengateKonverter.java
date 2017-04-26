package UniVonv;

import UniVonv.UnitConverter;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class FehrengateKonverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return (value - 32.0) / 1.8 + 273.15;
    }

    @Override
    public double fromSI(double siValue) {
        return (siValue - 273.15) * 1.8 + 32.0;
    }

    @Override
    public String getName() {
        return "Fahrengate";
    }

}
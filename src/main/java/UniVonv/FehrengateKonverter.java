package UniVonv;

import UniVonv.UnitConverter;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class FehrengateKonverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return (value * 9.0 / 5.0) -459.67;
    }

    @Override
    public double fromSI(double siValue) {
        return ((siValue) * (9.0 / 5.0)) -459.67;
    }

    @Override
    public String getName() {
        return "Fahrengate";
    }

}
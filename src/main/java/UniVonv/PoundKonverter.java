package UniVonv;

/**
 * Created by Gri on 26.04.2017.
 */
public class PoundKonverter extends UnitConverter {


    @Override
    public double toSI(double value) {
        return value * 2.20462;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 2.20462;
    }

    @Override
    public String getName() {
        return "Pound";
    }
}

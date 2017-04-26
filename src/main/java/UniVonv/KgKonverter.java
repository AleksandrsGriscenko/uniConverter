package UniVonv;

/**
 * Created by Gri on 26.04.2017.
 */
public class KgKonverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue;
    }

    @Override
    public String getName() {
        return "Kg";
    }
}

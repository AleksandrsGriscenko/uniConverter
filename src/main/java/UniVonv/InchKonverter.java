package UniVonv;

/**
 * Created by Gri on 26.04.2017.
 */
public class InchKonverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 0.0254; }

    @Override
    public double fromSI(double siValue) {
        return siValue / 0.0254; }

    @Override
    public String getName() {
        return "Inches";
    }
}

package UniVonv;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class KelvinKonverter  extends UnitConverter {

    @Override
    public double toSI (double value){
        return value;
    }

    @Override
    public double fromSI (double siValue){
        return siValue;
    }

    @Override
    public String getName(){
        return "Kelvin";
    }


}

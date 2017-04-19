package UniVonv;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class UniversalConverter {
    private List<UnitConverter> converters = Arrays.asList (
            new CelsiumKonverter(),
            new FehrengateKonverter(),
            new KelvinKonverter()
    );

    private  UnitConverter sourceConverter;
    private  UnitConverter tergedConverter;


    @Command
    public void list() {
        for (int i = 0; i < converters.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, converters.get(i));
        }
    }            //vyvodim spisok konvertorov

    @Command
    public void source(int idx) {
        sourceConverter = converters.get(idx - 1);
            }

    @Command
    public void target(int idx){
        tergedConverter = converters.get(idx - 1);
    }

    @Command
    public double convert(double value){
        double siValue =  sourceConverter.toSI(value);
        double  targedValue = tergedConverter.fromSI(siValue);
        return  targedValue;
    }







}

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {

        Water myWater = new Water("coca cola company");

        Function<Water,Wine> turnWaterIntoWine = water->{
            String company = water.getCompany();
            return new Wine(company);
        };

        Wine myWine = turnWaterIntoWine.apply(myWater);
        Wine mySecondWine = turnWaterIntoWineOldschool(myWater);
        System.out.println(myWine.getProducent());

    }

    public static Wine turnWaterIntoWineOldschool(Water water){
        String company = water.getCompany();
        return new Wine(company);
    }
}

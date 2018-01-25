import java.util.function.BinaryOperator;

public class MainBinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Income> sumIncome = (x,y)->{

            return new Income(x.getValue()+y.getValue());
        };

        Income butterSold = new Income(5);
        Income bread = new Income(5);

        System.out.println(sumIncome.apply(butterSold,bread));
    }

    public static Income sumIncomeOldschool(Income income1,Income income2){
        return new Income(income1.getValue()+income2.getValue());
    }
}

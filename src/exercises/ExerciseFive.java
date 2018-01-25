package exercises;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExerciseFive {

    //5. Napisz funkcję, która przyjmuje listę <Person> i zwraca listę z samymi kobietami.
    public static void main(String[] args) {

        Function<List<Person>,List<Person>> getOnlyWomen = list ->{
         List<Person> onlyWomenList = new ArrayList<>();
         for(Person person:list) if(!person.isMale()) onlyWomenList.add(person);

         return onlyWomenList;
        };


        Function<List<Person>,List<Person>> getOnlyWomenWithAnotherLambda = list ->{
            List<Person> onlyWomenList = new ArrayList<>();
            list.forEach(x->{
                if(!x.isMale()) onlyWomenList.add(x);
            });
            return onlyWomenList;
        };

    }

}

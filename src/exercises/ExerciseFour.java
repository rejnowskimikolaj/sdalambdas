package exercises;

import java.util.List;
import java.util.function.Predicate;

public class ExerciseFour {
/*
4.  Napisz funkcję, która zwraca true, jeśli w kolekcji <Person>
znajduje się dorosły mężczyzna, który ma na imię jacek.
 */
    public static void main(String[] args) {

        Predicate<Person> isMale = x->{
            return x.isMale();
        };

        Predicate<Person> isMaleTwo = x->x.isMale();


        Predicate<Person> isJacek = person->person.getFirstName().toLowerCase().equals("jacek");


        Predicate<Person> isAdult = person -> person.getAge()>=18;
        Predicate<List<Person>> hasAdultMaleJacek = list->{
            for(Person person:list) {
                if(person.getAge()>=18 && person.getFirstName().equals("Jacek")&&person.isMale())return true;
            }
            return false;
        };

        Predicate<List<Person>> hasAdultMaleJacekTwo = list->{
            for(Person person:list) {
                if(isAdult.test(person) && isJacek.test(person) &isMale.test(person))return true;
            }
            return false;
        };




    }

    public static Predicate<Person> isMaleTwo = x->x.isMale();

}

package exercises;

import java.util.function.Predicate;

public class ExerciseThree {
    public static void main(String[] args) {

        //a) funkcję, która zwraca true, jeśli Person jest mężczyzną

        //dłuzsza wersja
        Predicate<Person> isMale = x->{
            return x.isMale();
        };

        //krótsza wersja
        Predicate<Person> isMaleTwo = x->x.isMale();

        //b) funkcję, która zwraca true, jeśli Person ma na imię "Jacek"

        Predicate<Person> isJacek = person->person.getFirstName().toLowerCase().equals("jacek");

        //c)funkcję, która zwraca true, jeśli jest osoba jest pełnoletnia.

        Predicate<Person> isAdult = person -> person.getAge()>=18;

         }
}

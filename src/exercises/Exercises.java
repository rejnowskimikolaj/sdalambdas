package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Exercises {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n->n%2==0;

        List<String> list = Arrays.asList("ala;ma;kota;kota;ma;vdgfdgdgotchyaa;ale".split(";"));
        Predicate<List<String>> hasGotchya = lista -> lista.contains("gotchya");

        Predicate<List<String>> hasGotchyaIgnoreCases = lista -> {
            for(String string:lista) {
                if(string.toLowerCase().contains("gotchya")) return true;
            }

            return false;
        };


        System.out.println(hasGotchyaIgnoreCases.test(list));


    }
}

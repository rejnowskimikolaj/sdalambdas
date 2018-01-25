import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {

        //tworzymy naszą lambdę, która
        Predicate<Student> isAdult = student->{
            return student.getAge()>=18;
        } ;

        Predicate<Student> isAdult2 = student-> student.getAge()>=18;
        Predicate<Student> isAdult3 = student-> student.getAge()>=18;
        Student student = new Student("andrzej",15);
        isAdult.test(student);


    }

    //klasyczna metoda
    public static boolean isStudentAdult(Student student){
        return student.getAge()>=18;
    }
}

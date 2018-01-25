import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("fdsfs");

        });
        Random random = new Random();
        RandomClass randomClass = new RandomClass();
        randomClass.getNumber(new SomeInterface() {
            @Override
            public int getInt() {
                System.out.println("zwracam 1");
                return 1;
            }
        });

        randomClass.getNumber(()->{
            System.out.println("zwracam 0");
            return 0;        });

        SomeInterfaceImplemntingClass someInterfaceImplemntingClass = new SomeInterfaceImplemntingClass();
        randomClass.getNumber(someInterfaceImplemntingClass);

    }
}

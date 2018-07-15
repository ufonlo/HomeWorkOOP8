package Work_8.cleaner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullsRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Henadii");
        list.add(null);
        list.add("Marina");
        System.out.println(list);
        System.out.println();

        RemoveNulls.removeNulls(list);
        System.out.println(list);
        System.out.println();

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };
        List<String> listTwo = new ArrayList<>();
        listTwo.add("Henadii");
        listTwo.add("Ben");
        listTwo.add("Konstantin");
        System.out.println(listTwo);
        System.out.println();

        RemoveNulls.remove(listTwo, predicate);
        System.out.println(listTwo);

    }
}
//[Henadii, null, Marina]
//
//      [Henadii, Marina]
//
//        [Henadii, Ben, Konstantin]
//
//        [Ben]
//
//        Process finished with exit code 0
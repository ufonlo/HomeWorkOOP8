package Work_8.binarySearch;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinarySearchRunner {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 30, 50};

        System.out.println(BinarySearch.binarySearch(array, 30)); // 3
        System.out.println(BinarySearch.binarySearch(array, 20)); // 2
        System.out.println(BinarySearch.binarySearch(array, 40)); // -5

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(50);

        System.out.println();

        System.out.println(BinarySearch.binarySearch(list, 30, Comparator.naturalOrder())); // 3
        System.out.println(BinarySearch.binarySearch(list, 20, Comparator.naturalOrder())); // 2
        System.out.println(BinarySearch.binarySearch(list, 40, Comparator.naturalOrder())); // -5
    }
}
//Test
//3
//2
//-5
//
//3
//2
//-5
//
//Process finished with exit code 0
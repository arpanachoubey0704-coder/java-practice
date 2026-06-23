import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class function {
    public static void main(String[] args) {
        int n = 100000;

        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList insertion at beginning: " + (end - start) / 1000000.0 + " ms");

        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList insertion at beginning: " + (end - start) / 1000000.0 + " ms");
    }
}
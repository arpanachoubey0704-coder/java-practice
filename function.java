import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class function {
    public static void main(String[] args) {
        int n = 50000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.get(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList access time: " + (end - start) / 1000000 + " ms");
    }
}
import java.util.ArrayList;
import java.util.Arrays;

public class reverseArray {

    public static ArrayList<Integer> reverse(ArrayList<Integer> al) {
        int i = 0;
        int j = al.size() - 1;

        while (i < j) {
            int temp = al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
            i++;
            j--;
        }

        return al;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println("Original: " + list);

        ArrayList<Integer> reversed = reverse(list);
        System.out.println("Reverse: " + reversed);
    }
}

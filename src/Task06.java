import java.util.Comparator;

public class Task06 {

    public static void main(String[] args) {

    }
}
class IntComparator2 implements Comparator<Integer> {
    public static int int_len(int a) {
        int i = 0;
        while (a > 0) {
            a /= 10;
            i++;
        }
        return a;
    }
    public static int min_len(int a1, int a2) {
        if (int_len(a1) > int_len(a2)) {
            return int_len(a2);
        }
        return int_len(a1);
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        for (int i = 0; i < min_len(o1, o2)) {
            if (o1 % 10 < o2 % 10) {
                return 1;
            } else if (o1 % 10 > o2 % 10) {
                return -1;
            }
            }
        if (int_len(o1) < int_len(o2)) {
            return o1;
        }
        return o2;
        }
}
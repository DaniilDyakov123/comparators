public class Task01 {
    public static void main(String[] args) {
        IntComparator c = new IntComparator();
        System.out.println(c.compare(3, 4));
    }
}

class IntComparator<Integer> implements java.util.Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (int) o1 - (int) o2;
    }
}
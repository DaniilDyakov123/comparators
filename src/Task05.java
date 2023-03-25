import java.util.Comparator;

public class Task05 {
    public static void main(String[] args) {

    }
}
class StrComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1.length();
        }
        return s2.length();
    }
}

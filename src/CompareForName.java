/**
 @auther 笑
 A Comparator implementation for sorting Employees by name.
 */
import java.util.Comparator;
public class CompareForName implements Comparator<Employee> {
    /**
     * Compares two Employee objects based on their names.
     *
     * @param o1 the first Employee to compare.
     * @param o2 the second Employee to compare.
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
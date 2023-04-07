/**
 @auther 笑
 A Comparator implementation for sorting Employees by pay rate.
 */
import java.util.Comparator;
public class CompareForPayRate implements Comparator<Employee> {
    /**
     * Compares two Employee objects based on their pay rates.
     *
     * @param o1 the first Employee to compare.
     * @param o2 the second Employee to compare.
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.payRate - o2.payRate < 0)
            return -1;
        else if (o1.payRate - o2.payRate > 0)
            return 1;
        else
            return 0;
    }
}
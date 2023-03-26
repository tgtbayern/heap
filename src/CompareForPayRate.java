import java.util.Comparator;

public class CompareForPayRate implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.payRate-o2.payRate<0)
            return -1;
        else if(o1.payRate-o2.payRate>0)
            return 1;
        else
            return 0;
    }
}

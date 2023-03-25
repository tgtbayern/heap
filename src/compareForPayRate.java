import java.util.Comparator;

public class compareForPayRate implements Comparator<employee> {
    @Override
    public int compare(employee o1, employee o2) {
        if(o1.payRate-o2.payRate<0)
            return -1;
        else if(o1.payRate-o2.payRate>0)
            return 1;
        else
            return 0;
    }
}

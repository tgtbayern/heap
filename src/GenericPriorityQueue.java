import java.util.ArrayList;
import java.util.Comparator;

public interface GenericPriorityQueue<E,T extends Comparator<E>> {
    public void insert(E element);
    public void delete(int i);
    public boolean isEmpty();
    public ArrayList<E> sort();
}

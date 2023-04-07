import java.util.ArrayList;

public interface GenericPriorityQueue<E> {
    public void insert(E element);
    public void delete(int i);
    public boolean isEmpty();
    public ArrayList<E> sort();
}

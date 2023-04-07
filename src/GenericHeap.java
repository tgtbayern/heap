import java.util.ArrayList;

public interface GenericHeap<E> {
    public int parent(int i);
    public int left(int i);
    public int right(int i);
    public void minHeapfiy(ArrayList<E> heap, int i);
    public void build();
    public void insert(E element);
}

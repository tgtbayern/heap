import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<E,T extends Comparator<E>> implements GenericPriorityQueue<E,T> {
    ArrayList<E> array;
    T comparator;
    Heap heap;
    public PriorityQueue(ArrayList<E> array, T comparator){
        this.array=array;
        this.comparator=comparator;
        heap=new Heap<>(array,comparator);
    }
    public void insert(E element){
        heap.insert(element);
    }
    public void delete(int i){
        heap.delete(i);
    }
    public boolean isEmpty(){
        return heap.isEmpty();
    }

    public ArrayList<E> sort(){
        return heap.sort();
    }
}

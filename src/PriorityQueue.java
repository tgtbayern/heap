
import java.util.ArrayList;
import java.util.Comparator;
/**

 A PriorityQueue implementation using a Heap.
 @author 笑
 @param <E> the type of elements in the PriorityQueue.
 @param <T> a Comparator for elements of type E.
 */
public class PriorityQueue<E,T extends Comparator<E>> implements GenericPriorityQueue<E,T> {
    ArrayList<E> array;
    T comparator;
    Heap heap;

    /**
     * Constructs a PriorityQueue with the given ArrayList and Comparator.
     *
     * @param array      the ArrayList used to store the elements of the PriorityQueue.
     * @param comparator the Comparator used to compare elements of type E.
     */
    public PriorityQueue(ArrayList<E> array, T comparator) {
        this.array = array;
        this.comparator = comparator;
        heap = new Heap<>(array, comparator);
    }

    /**
     * Inserts an element into the PriorityQueue.
     *
     * @param element the element to be inserted.
     */
    public void insert(E element) {
        heap.insert(element);
    }

    /**
     * Deletes the element at the specified index in the PriorityQueue.
     *
     * @param i the index of the element to be deleted.
     */
    public void delete(int i) {
        heap.delete(i);
    }

    /**
     * Checks if the PriorityQueue is empty.
     *
     * @return true if the PriorityQueue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    /**
     * Sorts the elements in the PriorityQueue in non-descending order and returns them in an ArrayList.
     *
     * @return The sorted ArrayList of elements.
     */
    public ArrayList<E> sort() {
        return heap.sort();
    }
}
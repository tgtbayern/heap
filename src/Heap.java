
import java.util.ArrayList;
import java.util.Comparator;
/**
 This class implements a generic heap using an ArrayList and a Comparator.
 It implements the GenericHeap interface.
 @author 笑
 @param <E> The type of the elements in the heap.
 @param <T> The type of the comparator used to compare the elements.
 */
public class Heap<E,T extends Comparator<E>> implements GenericHeap<E,T> {
    ArrayList<E> heap;
    T comparator;

    /**
     * Constructs a Heap object with the given ArrayList and Comparator.
     * The ArrayList is initialized with a null element.
     *
     * @param heap       The ArrayList used to store the elements of the heap.
     * @param comparator The Comparator used to compare the elements of the heap.
     */
    public Heap(ArrayList<E> heap, T comparator) {
        this.heap = heap;
        this.comparator = comparator;
        heap.add(null);
    }

    /**
     * Calculates the index of the parent of a given index in the heap.
     *
     * @param i The index of the element in the heap.
     * @return The index of the parent of the element at index i.
     */
    public int parent(int i) {
        return i / 2;
    }

    /**
     * Calculates the index of the left child of a given index in the heap.
     *
     * @param i The index of the element in the heap.
     * @return The index of the left child of the element at index i.
     */
    public int left(int i) {
        return 2 * i;
    }

    /**
     * Calculates the index of the right child of a given index in the heap.
     *
     * @param i The index of the element in the heap.
     * @return The index of the right child of the element at index i.
     */
    public int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Maintains the min-heap property of the heap starting at a given index.
     * Assumes that the left and right subtrees of the index satisfy the min-heap property.
     *
     * @param heap The ArrayList representing the heap.
     * @param i    The index of the element to start maintaining the min-heap property from.
     */
    public void minHeapfiy(ArrayList<E> heap, int i) {
        int smallest;
        int left = left(i);
        int right = right(i);
        if (left <= heap.size() - 1 && comparator.compare(heap.get(left), heap.get(i)) < 0)
            smallest = left;
        else
            smallest = i;
        if (right <= heap.size() - 1 && comparator.compare(heap.get(right), heap.get(smallest)) < 0)
            smallest = right;
        if (smallest != i) {
            E temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);
            minHeapfiy(heap, smallest);
        }
    }

    /**
     * Builds the min-heap by maintaining the min-heap property for each element in the heap.
     */
    public void build() {
        for (int i = heap.size() - 1; i >= 1; i--)
            minHeapfiy(heap, i);
    }

    /**
     * Inserts an element into the heap and rebuilds the min-heap.
     *
     * @param element The element to be inserted into the heap.
     */
    public void insert(E element) {
        heap.add(element);
        build();
    }

    /**
     * Deletes an element from the heap at a given index and rebuilds the min-heap.
     *
     * @param i The index of the element to be deleted from the heap.
     */
    public void delete(int i) {
        heap.remove(i);
        minHeapfiy(heap, i);
    }

    /**
     * Checks if the heap is empty.
     *
     * @return true if the heap is empty, false otherwise.
     */
    public boolean isEmpty() {
        return heap.size() == 0;
    }

    /**
     * Sorts the elements in the heap in non-descending order and returns them in an ArrayList.
     *
     * @return The sorted ArrayList of elements.
     */
    public ArrayList<E> sort() {
        ArrayList<E> array = new ArrayList<>(heap);
        ArrayList<E> result = new ArrayList<>();
        build();
        for (int i = array.size() - 1; i >= 1; i--) {
            E temp = array.get(i);
            array.set(i, array.get(1));
            array.set(1, temp);
            result.add(array.remove(i));
            minHeapfiy(array, 1);
        }
        return result;
    }
}
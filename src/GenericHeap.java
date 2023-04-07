import java.util.ArrayList;
import java.util.Comparator;

/**

 An interface that specifies the operations of a generic heap.
 @author 笑
 @param <E> the type of elements in the heap.
 @param <T> a Comparator for comparing elements of type E.
 */
public interface GenericHeap<E,T extends Comparator<E>> {

    /**

     Returns the index of the parent of the element at index i.
     @param i the index of the element.
     @return the index of the parent of the element at index i.
     */
    public int parent(int i);
    /**

     Returns the index of the left child of the element at index i.
     @param i the index of the element.
     @return the index of the left child of the element at index i.
     */
    public int left(int i);
    /**

     Returns the index of the right child of the element at index i.
     @param i the index of the element.
     @return the index of the right child of the element at index i.
     */
    public int right(int i);
    /**

     Performs a min-heapify operation on the heap.
     @param heap the heap to min-heapify.
     @param i the index of the element to start min-heapify.
     */
    public void minHeapfiy(ArrayList<E> heap, int i);
    /**

     Builds a min-heap from the elements of the heap.
     */
    public void build();
    /**

     Inserts an element into the heap.
     @param element the element to insert.
     */
    public void insert(E element);
}

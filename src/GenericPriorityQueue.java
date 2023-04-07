import java.util.ArrayList;
import java.util.Comparator;

/**

 This interface defines the operations of a generic priority queue.
 @author 笑
 @param <E> the type of elements stored in the priority queue.
 @param <T> the type of comparator used to compare elements in the priority queue.
 */
public interface GenericPriorityQueue<E,T extends Comparator<E>> {
    /**

     Inserts an element into the priority queue.
     @param element the element to be inserted.
     */
    public void insert(E element);
    /**

     Deletes an element from the priority queue.
     @param i the index of the element to be deleted.
     */
    public void delete(int i);
    /**

     Checks whether the priority queue is empty or not.
     @return true if the priority queue is empty, false otherwise.
     */
    public boolean isEmpty();
    /**

     Sorts the elements in the priority queue.
     @return an ArrayList of the sorted elements.
     */
    public ArrayList<E> sort();
}

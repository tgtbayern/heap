import java.util.ArrayList;
import java.util.Comparator;

public class Heap<E,T extends Comparator<E>>{
    ArrayList<E> heap;
    T comparator;
    public Heap(ArrayList<E> heap,T comparator){
        this.heap=heap;
        this.comparator=comparator;
        heap.add(null);
    }
    public int parent(int i){
        return i/2;
    }

    public int left(int i){
        return 2*i;
    }

    public int right(int i){
        return 2*i+1;
    }

    public void minHeapfiy(ArrayList<E> heap, int i){
        int smallest;
        int left = left(i);
        int right = right(i);
        if(left <= heap.size()-1 && comparator.compare(heap.get(left),heap.get(i)) < 0)
            smallest=left;
        else
            smallest = i;
        if (right <= heap.size()-1 && comparator.compare(heap.get(right),heap.get(smallest)) < 0)
            smallest = right;
        if (smallest != i){
            E temp = heap.get(i);
            heap.set(i,heap.get(smallest));
            heap.set(smallest,temp);
            minHeapfiy(heap,smallest);
        }
    }
    public void build(){
        for(int i=heap.size()-1;i>=1;i--)
            minHeapfiy(heap,i);
    }

    public void insert(E element){
        heap.add(element);
        build();
    }

    public void delete(int i){
        heap.remove(i);
        minHeapfiy(heap,i);
    }

    public boolean isEmpty(){
        return heap.size()==0;
    }

    public ArrayList<E> sort(){
        ArrayList<E> array=new ArrayList<>(heap);
        ArrayList<E> result=new ArrayList<>();
        build();
        for(int i=array.size()-1;i>=1;i--){
            E temp = array.get(i);
            array.set(i,array.get(1));
            array.set(1,temp);
            result.add(array.remove(i));
            minHeapfiy(array,1);
        }
        return result;
    }
}

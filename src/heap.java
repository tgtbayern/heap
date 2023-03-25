import java.util.ArrayList;

public class heap <E>{
    ArrayList<E> heap=new ArrayList<>();

    public int parent(int i){
        return i/2;
    }

    public int left(int i){
        return 2*i;
    }

    public int right(int i){
        return 2*i+1;
    }

    public void maxHeapify(ArrayList<E> heap,int i){
        int left=left(i);
        int right=right(i);
        if (left<=heap.size() && heap.get(left)>heap.get(i))
    }
}

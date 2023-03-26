import java.util.ArrayList;
import java.util.Comparator;

public class helper {
    public static void main(String args[]){
        Employee a=new Employee("a",500);
        Employee b=new Employee("b",400);
        Employee c=new Employee("c",300);
        Employee d=new Employee("d",200);
        Employee e=new Employee("e",100);
        ArrayList<Employee> array=new ArrayList<>();
        ArrayList<Employee> array1=new ArrayList<>();

        CompareForPayRate comparator=new CompareForPayRate();
        Heap<Employee,CompareForPayRate> heap=new Heap(array,comparator);
        heap.insert(a);
        heap.insert(e);
        heap.insert(d);
        heap.insert(c);
        heap.insert(b);
        array1=heap.sort();
        for (int i=0;i<=array1.size()-1;i++)
            System.out.println(array1.get(i).payRate);
        }
        
    }

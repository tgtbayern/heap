import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        ArrayList<Employee> array1;

        CompareForPayRate comparator=new CompareForPayRate();
        Heap<Employee,CompareForPayRate> heap=new Heap(array,comparator);
        heap.insert(a);
        heap.insert(e);
        heap.insert(d);
        heap.insert(c);
        heap.insert(b);


        try {
            BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double salary = Double.parseDouble(fields[1]);
                Employee employee = new Employee(name, salary);
                // do something with the employee object
                heap.insert(employee);
            }
            array1=heap.sort();
            for (int i=0;i<=array1.size()-1;i++)
                System.out.println(array1.get(i).payRate);
            reader.close();
        } catch (
                IOException error) {
            error.printStackTrace();
        }
    }

}

        


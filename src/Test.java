import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void start(){
        Employee a=new Employee("a",500);
        Employee b=new Employee("b",400);
        Employee c=new Employee("c",300);
        Employee d=new Employee("d",200);
        Employee e=new Employee("e",100);
        ArrayList<Employee> array=new ArrayList<>();
        CompareForPayRate comparator=new CompareForPayRate();
        //CompareForName comparator=new CompareForName();
        PriorityQueue priorityQueue=new PriorityQueue<>(array,comparator);
        ArrayList<Employee> sort;


        //Heap<Employee,CompareForPayRate> heap=new Heap(array,comparator);
        priorityQueue.insert(a);
        priorityQueue.insert(e);
        priorityQueue.insert(d);
        priorityQueue.insert(c);
        priorityQueue.insert(b);


        try {
            BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double salary = Double.parseDouble(fields[1]);
                Employee employee = new Employee(name, salary);
                // do something with the employee object
                priorityQueue.insert(employee);
            }
            sort=priorityQueue.sort();
            for (int i=0;i<=sort.size()-1;i++)
                System.out.println(sort.get(i).name+" "+sort.get(i).payRate);
            reader.close();
        } catch (
                IOException error) {
            error.printStackTrace();
        }
    }
}

        


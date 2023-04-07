import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 笑
 * The Test class is used to test the PriorityQueue class and its functionality.
 */
public class Test {
    /**
     The start method initializes Employee objects, creates a PriorityQueue object, and tests its functionality.
     */
    public static void start(){
        ArrayList<Employee> array=new ArrayList<>();
        CompareForPayRate comparator=new CompareForPayRate();
        PriorityQueue priorityQueue=new PriorityQueue<>(array,comparator);
        creat(priorityQueue);
        display(priorityQueue);
    }

    /**
     The creat method reads employee data from a file and creates Employee objects for each line of data.
     @param priorityQueue the PriorityQueue object to which the Employee objects will be added
     @return the PriorityQueue object with the newly added Employee objects
     */
    public static PriorityQueue creat(PriorityQueue priorityQueue){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double salary = Double.parseDouble(fields[1]);
                Employee employee = new Employee(name, salary);
                priorityQueue.insert(employee);
            }
            reader.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
        return priorityQueue;
    }

    /**
     The display method sorts the Employee objects in the PriorityQueue object and displays their names and pay rates.
     @param priorityQueue the PriorityQueue object containing the Employee objects to be displayed
     */
    public static void display(PriorityQueue priorityQueue){
        ArrayList<Employee> sort;
        sort=priorityQueue.sort();
        for (int i=0;i<=sort.size()-1;i++)
            System.out.println(sort.get(i).name+'\t'+sort.get(i).payRate);
    }
}
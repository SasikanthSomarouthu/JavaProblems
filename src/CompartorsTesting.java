import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee Sasi=new Employee("Sasikanth", 21, 21.11, 21L);
        Employee Sasikanth=new Employee("Sas", 23, 21.11, 21L);
        Employee Sasis=new Employee("Sasik", 24, 21.11, 21L);
        
        List<Employee> emplist=new ArrayList<Employee>();
        emplist.add(Sasi);
        emplist.add(Sasikanth);
        emplist.add(Sasis);
        Comparator<Employee> employeeNameComparator
        = Comparator.comparing(Employee::getName);
      

        
        emplist.stream().forEach(e-> System.out.println(e.getAge()+"::"+e.getName()));
        
	}

}

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,Object> map=new HashMap<>();
    map.put(1, "java");
    map.put(5,"oracle");
    map.put(2,234);
    map.put(3,345.56);
    map.put(null,123);
    map.put(10,null);
    map.put(7, null);
    System.out.println(map);
    System.out.println(map.get(2));
    System.out.println(map.containsKey(3));
    Set keys=map.keySet();
    System.out.println(keys);
    Collection val=map.values();
    System.out.println(val);
    Set keypairs=map.entrySet();
    System.out.println(keypairs);
   Set s=map.entrySet();
   Iterator i=s.iterator();
   while(i.hasNext()) {
	   Map.Entry entry=(Map.Entry)i.next();
	   System.out.println(entry.getKey()+" "+entry.getValue());
	    
   }
   HashSet<Employee> set=new HashSet<>();
   set.add(new Employee(1,"raj"));
   set.add(new Employee(1,"raj"));
   set.add(new Employee(3,"ram"));
   System.out.println(set);
    
    
    
    
	}

}

class Employee{
 Integer id;
 String name;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
public Employee(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public int hashCode() {
	return 1;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(id, other.id) && Objects.equals(name, other.name);
}
 
}
